{
<html><head> <link rel="stylesheet" href="style.css"></head><body>
<h2>build</h2>

<p>An example of building a simple application using
JScheme.

<pre>
}

(define appName "app")			; Name of the application.

;;;Show Java backtraces.
(set! jsint.BacktraceException.printJavaTrace$ #t)

(load "using/command.scm")
(load "elf/basic.scm")
(load "elf/classpath.scm")
(load "using/run.scm")

{<hr><h2>Directories</h2>}

;;; Assumes the a subdirectory is the first thing in the class path.
(define appDir (.getParentFile
		(.getCanonicalFile
		 (File. (car (crack ($ "java.class.path")
				    ($ "path.separator")))))))
(define srcDir (File. appDir "src"))
(define classDir (File. appDir "classes"))
(define libDir (File. appDir "lib"))
(define docDir (File. appDir "doc"))
(define apiDir (File. docDir "api"))
(define jarFile (File. libDir {[appName].jar}))

{<hr><h2>Extend classpath</h2>}
;;; classpath - list of srcDir classDir and jar files under lib/
(define classpath (flatten
		   (list
		   libDir
		   srcDir
		   classDir
		   (files** libDir isJarFile)
		   ;; If you need javac or rmic include tools.jar
		   (File. (.getParent (File. ($ "java.home")))
			  "lib/tools.jar"))))

;;; Grow the classpath
(for-each addClasspathUrl classpath)

(define (compile classpath srcDir classDir files)
  ;; Compile all .java files under srcDir that need it.
  (let ((files (filter (needsUpdate? (java->class srcDir classDir))
		       files)))
    (if (> (length files) 0)
	(begin
	  (display {Compiling [(length files)] files.\n})
	  (out (run (cmd javac -sourcepath ,srcDir -d ,classDir
			 -classpath ,classpath ,files))))
	(display {No files need compiling.\n}))))

(define (directory->package d)
  ;; Convert a relativized directory name into a package name.
  (apply string-append
	 (separate "." (crack (.toString d) ($ "file.separator")))))

{<hr><h2>Commands</h2>}
(define-command (-clean)
  "Remove all generated files."
  (for-each .delete (files** classDir identity))
  (.delete jarFile))

(define-command (-etags)
  "Make a TAGS table for EMACS meta-dot.
The command etags must be in your path."
  (out (run (cmd etags
		 -o ,(File. srcDir "TAGS")
		 ,(files** srcDir (lambda (f) (or (isJavaFile f)
						  (isSchemeFile f))))))))
(define-command (-javac)
  "Recompile java files that need it."
  (mkdirs classDir)
  (compile (path classpath) srcDir classDir
	   (files** srcDir isJavaFile)))

(define-command (-javadoc)
  "Generate API documentation.
Must have run -javac first."
  (let ((packages (map directory->package
		       (relativize classDir (files** classDir .isDirectory)))))
    (out (run (cmd (javadoc -private -author -version -use
			  -windowtitle "API"
			  -sourcepath ,srcDir
			  -classpath ,classDir
			  -doctitle "API"
			  -d ,apiDir
			  ,packages))))))

(define-command (-jar)
  "Build jar from .class and .scm files"
  (copyFiles srcDir classDir (files** srcDir isSchemeFile))
  (out (run (cmd (jar -cvf ,jarFile -C ,classDir "." )))))
