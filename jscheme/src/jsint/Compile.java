package jsint;
  /**
    * this file is automatically generated by the jscheme->javac compiler Compiler.scm. 
    * Modify at your own risk!
    */
  import jsint.*;
  import java.lang.reflect.*;
  import java.util.*;
  
  
  public class Compile extends jsint.Procedure implements jsint.Function,  Runnable {  
      public int whichcode=0;  // corresponds to a numbering of the toplevel procedures of the program
      public int whichtype=0;  // 0 = user defined procedure, 1 = java literal
      public static final int USER_DEF=0, JAVA_LIT=1;
      public Pair frame;
      public DynamicEnvironment dynEnv;

      public Compile() {
          super();
          dynEnv=Scheme.getInteractionEnvironment();
      }
      public Compile(int t, int n, Pair f) {
          whichtype = t;
          whichcode = n;
          frame = f;
          dynEnv = Scheme.getInteractionEnvironment();
      }
      public Compile(int t, int n, Pair f, DynamicEnvironment d) {
          whichtype = t;
          whichcode = n;
          frame = f;
          dynEnv = d;
      }
  
      private Boolean addImport(String s) {
         jsint.Import.addImport(s);
         return Boolean.TRUE;
      }
  
      public void run() {
        this.invoke(null);
      } 
  
      public Object[] makeArgArray(jsint.Pair args) {
         return new Object[]{args};
      }

      public Object apply(Object[] args) {
      return invoke((Pair)args[0]);
      }
  
      public Object apply(Pair args) {
        return invoke(args);
      }
  
      public Object invoke(Pair args)
      {
        return LCO.eval(invoke1(args));
      }
  
    static Object tmp;
  
  
    public static void load() { 
      new Compile().init();
    }

    public static void load(String shellArgs[]) {
       Scheme.getInteractionEnvironment().setValue(Symbol.intern("shellArgs"), shellArgs);
       load();
    }

    public static void main(String shellArgs[]) {
       Symbol main = jsint.Symbol.intern("main");
       load(shellArgs);
       if (main.isDefined())
          {
             DynamicEnvironment dynEnv = Scheme.getInteractionEnvironment();
             ((jsint.Procedure) (dynEnv.getValue(main))).apply(new Pair(shellArgs,Pair.EMPTY));
          }
     }

      public Object invoke1(Pair args) {
      if (whichtype == USER_DEF) {
       switch (whichcode) {
          case 0: return(_L0(args)); 
          case 1: return(_L1(args)); 
          case 2: return(_L2(args)); 
          case 3: return(_L3(args)); 
          case 4: return(_L4(args)); 
          case 5: return(_L5(args)); 
          case 6: return(_L6(args)); 
          case 7: return(_L7(args)); 
          case 8: return(_L8(args)); 
          case 9: return(_L9(args)); 
          case 10: return(_L10(args)); 
          case 11: return(_L11(args)); 
          case 12: return(_L12(args)); 
          case 13: return(_L13(args)); 
          case 14: return(_L14(args)); 
          case 15: return(_L15(args)); 
          case 16: return(_L16(args)); 
          case 17: return(_L17(args)); 
          case 18: return(_L18(args)); 

         default:  break;
       }}
      else {
       switch (whichcode) {
          case 0: return(_J0(args)); 
          case 1: return(_J1(args)); 
          case 2: return(_J2(args)); 
          case 3: return(_J3(args)); 
          case 4: return(_J4(args)); 
          case 5: return(_J5(args)); 
          case 6: return(_J6(args)); 
          case 7: return(_J7(args)); 
          case 8: return(_J8(args)); 
          case 9: return(_J9(args)); 
          case 10: return(_J10(args)); 
          case 11: return(_J11(args)); 
          case 12: return(_J12(args)); 
          case 13: return(_J13(args)); 
          case 14: return(_J14(args)); 

         default:  break;
       }}



      return null;
      }


  
   public void init() {
     Pair Args = null;
     dynEnv.setValue(Symbol.intern("this"), this);
     Class _p = Primitive.class; // this loads the primitives
((jsint.Procedure) _J0/* jsint.Procedure.tryCatch */).apply(new Pair(new Compile(USER_DEF, 1, new Pair( Args, this.frame), dynEnv),
    new Pair(new Compile(USER_DEF, 2, new Pair( Args, this.frame), dynEnv),
    Pair.EMPTY)));

dynEnv.setValue(Symbol.intern("printUsage"), new Compile(USER_DEF, 3, new Pair( Args, this.frame), dynEnv));

dynEnv.setValue(Symbol.intern("processCommandLineArgs"), new Compile(USER_DEF, 11, new Pair( Args, this.frame), dynEnv));

dynEnv.setValue(Symbol.intern("main"), new Compile(USER_DEF, 18, new Pair( Args, this.frame), dynEnv));

  
   }

 // definitions of global variables 
public static final Object printUsage = Symbol.intern("printUsage");

public static final Object main = Symbol.intern("main");


 // definitions of Scheme variables defined externally
   static Object null_63_= Symbol.intern("null?");

   static Object member= Symbol.intern("member");

   static Object Globals= Symbol.intern("Globals");

   static Object PackageName= Symbol.intern("PackageName");

   static Object second= Symbol.intern("second");

   static Object processCommandLineArgs= Symbol.intern("processCommandLineArgs");

   static Object rest= Symbol.intern("rest");

   static Object Verbose= Symbol.intern("Verbose");

   static Object UseReflection= Symbol.intern("UseReflection");

   static Object _60__61_= Symbol.intern("<=");

   static Object display= Symbol.intern("display");

   static Object list= Symbol.intern("list");

   static Object newline= Symbol.intern("newline");

   static Object cons= Symbol.intern("cons");

   static Object string_45_append= Symbol.intern("string-append");

   static Object first= Symbol.intern("first");

   static Object for_45_each= Symbol.intern("for-each");

   static Object compile_45_file= Symbol.intern("compile-file");

   static Object array_45__62_list= Symbol.intern("array->list");


 // definitions of quoted terms 
   static Object _C0=Boolean.TRUE;

   static Object _C1="usage: jsint.Compiler  [--help] [-h] [-verbose] [-v] [--package P] [-p P] file1.scm file2.scm ...";

   static Object _C2=Pair.EMPTY;

   static Object _C3=new Pair("-p",new Pair("--package",Pair.EMPTY));

   static Object _C4=new Pair("-v",new Pair("--verbose",Pair.EMPTY));

   static Object _C5=new Pair("-r",new Pair("--reflect",Pair.EMPTY));

   static Object _C6=new Pair("-h",new Pair("--help",Pair.EMPTY));

   static Object _C7="-";

   static Object _C8=new   Integer(2);

   static Object _C9=Boolean.FALSE;

   static Object _C10="unknown flag";

   static Object _C11=new   Integer(0);

   static Object _C12="Error while compiling ";

   static Object _C13="ERROR";


 // definitions of embedded lambdas 
 Object _L0(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) _J1/* jsint.compiler.Reflect.load */).apply(Pair.EMPTY);

tmp = ((jsint.Procedure) _J2/* jsint.compiler.CompileReflection.load */).apply(Pair.EMPTY);

tmp = new LCO(_J3/* jsint.compiler.Compiler.load */,Pair.EMPTY);


   return tmp; 
}

 Object _L1(Pair Args){
   Object tmp=null; 
 tmp = new LCO(new Compile(USER_DEF, 0, new Pair( Args, this.frame), dynEnv),Pair.EMPTY);


   return tmp; 
}

 Object _L2(Pair Args){
   Object tmp=null; 
 tmp = _C0;


   return tmp; 
}

 Object _L3(Pair Args){
   Object tmp=null; 
 tmp = new LCO(_J4/* .println */,new Pair((((jsint.Procedure)_J5/* System.out$ */).apply(jsint.Pair.EMPTY)),
    new Pair(_C1,
    Pair.EMPTY)));


   return tmp; 
}

 Object _L4(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) _J6/* Array.set */).apply(new Pair(dynEnv.getValue((Symbol)Globals),
    new Pair(dynEnv.getValue((Symbol)PackageName),
    new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)second)).apply(new Pair((((Pair) ((this.frame).nth(1 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY))));

tmp = new LCO(dynEnv.getValue((Symbol)processCommandLineArgs),new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)rest)).apply(new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)rest)).apply(new Pair((((Pair) ((this.frame).nth(1 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY)),
    Pair.EMPTY));


   return tmp; 
}

 Object _L5(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) _J6/* Array.set */).apply(new Pair(dynEnv.getValue((Symbol)Globals),
    new Pair(dynEnv.getValue((Symbol)Verbose),
    new Pair(_C0,
    Pair.EMPTY))));

tmp = new LCO(dynEnv.getValue((Symbol)processCommandLineArgs),new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)rest)).apply(new Pair((((Pair) ((this.frame).nth(1 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY));


   return tmp; 
}

 Object _L6(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) _J6/* Array.set */).apply(new Pair(dynEnv.getValue((Symbol)Globals),
    new Pair(dynEnv.getValue((Symbol)UseReflection),
    new Pair(_C0,
    Pair.EMPTY))));

tmp = new LCO(dynEnv.getValue((Symbol)processCommandLineArgs),new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)rest)).apply(new Pair((((Pair) ((this.frame).nth(1 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY));


   return tmp; 
}

 Object _L7(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) dynEnv.getValue((Symbol)printUsage)).apply(Pair.EMPTY);

tmp = new LCO(dynEnv.getValue((Symbol)processCommandLineArgs),new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)rest)).apply(new Pair((((Pair) ((this.frame).nth(1 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY));


   return tmp; 
}

 Object _L8(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) dynEnv.getValue((Symbol)display)).apply(new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)list)).apply(new Pair(_C10,
    new Pair((((Pair) ((this.frame).nth(0 ))).getEltNover2(1)),
    new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)rest)).apply(new Pair((((Pair) ((this.frame).nth(2 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY)))),
    Pair.EMPTY));

tmp = ((jsint.Procedure) dynEnv.getValue((Symbol)newline)).apply(Pair.EMPTY);

tmp = new LCO(dynEnv.getValue((Symbol)printUsage),Pair.EMPTY);


   return tmp; 
}

 Object _L9(Pair Args){
   Object tmp=null; 
 tmp = 
  (Boolean.FALSE.equals(
  (Boolean.FALSE.equals(((jsint.Procedure) _J7/* .startsWith */).apply(new Pair((( Pair) Args).getEltNover2(1),
    new Pair(_C7,
    Pair.EMPTY))))
  ?
  _C9
  :
  
  (Boolean.FALSE.equals(((jsint.Procedure) dynEnv.getValue((Symbol)_60__61_)).apply(new Pair(((jsint.Procedure) _J8/* .length */).apply(new Pair((( Pair) Args).getEltNover2(1),
    Pair.EMPTY)),
    new Pair(_C8,
    Pair.EMPTY))))
  ?
  _C9
  :
  _C0
  )
  ))
  ?
  
  (Boolean.FALSE.equals(((jsint.Procedure) _J7/* .startsWith */).apply(new Pair((( Pair) Args).getEltNover2(1),
    new Pair(_C7,
    Pair.EMPTY))))
  ?
  
  (Boolean.FALSE.equals(_C0)
  ?
  _C2
  :
  new LCO(dynEnv.getValue((Symbol)cons),new Pair((( Pair) Args).getEltNover2(1),
    new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)processCommandLineArgs)).apply(new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)rest)).apply(new Pair((((Pair) ((this.frame).nth(1 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY)),
    Pair.EMPTY)))
  )
  :
  new LCO(dynEnv.getValue((Symbol)processCommandLineArgs),new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)cons)).apply(new Pair(((jsint.Procedure) _J9/* .substring */).apply(new Pair((( Pair) Args).getEltNover2(1),
    new Pair(_C11,
    new Pair(_C8,
    Pair.EMPTY)))),
    new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)cons)).apply(new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)string_45_append)).apply(new Pair(_C7,
    new Pair(((jsint.Procedure) _J9/* .substring */).apply(new Pair((( Pair) Args).getEltNover2(1),
    new Pair(_C8,
    new Pair(((jsint.Procedure) _J8/* .length */).apply(new Pair((( Pair) Args).getEltNover2(1),
    Pair.EMPTY)),
    Pair.EMPTY)))),
    Pair.EMPTY))),
    new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)rest)).apply(new Pair((((Pair) ((this.frame).nth(1 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY))),
    Pair.EMPTY))),
    Pair.EMPTY))
  )
  :
  new LCO(new Compile(USER_DEF, 8, new Pair( Args, this.frame), dynEnv),Pair.EMPTY)
  );


   return tmp; 
}

 Object _L10(Pair Args){
   Object tmp=null; 
 tmp = 
  (Boolean.FALSE.equals(((jsint.Procedure) dynEnv.getValue((Symbol)member)).apply(new Pair((( Pair) Args).getEltNover2(1),
    new Pair(_C3,
    Pair.EMPTY))))
  ?
  
  (Boolean.FALSE.equals(((jsint.Procedure) dynEnv.getValue((Symbol)member)).apply(new Pair((( Pair) Args).getEltNover2(1),
    new Pair(_C4,
    Pair.EMPTY))))
  ?
  
  (Boolean.FALSE.equals(((jsint.Procedure) dynEnv.getValue((Symbol)member)).apply(new Pair((( Pair) Args).getEltNover2(1),
    new Pair(_C5,
    Pair.EMPTY))))
  ?
  
  (Boolean.FALSE.equals(((jsint.Procedure) dynEnv.getValue((Symbol)member)).apply(new Pair((( Pair) Args).getEltNover2(1),
    new Pair(_C6,
    Pair.EMPTY))))
  ?
  
  (Boolean.FALSE.equals(_C0)
  ?
  _C2
  :
  new LCO(new Compile(USER_DEF, 9, new Pair( Args, this.frame), dynEnv),new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)first)).apply(new Pair((((Pair) ((this.frame).nth(0 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY))
  )
  :
  new LCO(new Compile(USER_DEF, 7, new Pair( Args, this.frame), dynEnv),Pair.EMPTY)
  )
  :
  new LCO(new Compile(USER_DEF, 6, new Pair( Args, this.frame), dynEnv),Pair.EMPTY)
  )
  :
  new LCO(new Compile(USER_DEF, 5, new Pair( Args, this.frame), dynEnv),Pair.EMPTY)
  )
  :
  new LCO(new Compile(USER_DEF, 4, new Pair( Args, this.frame), dynEnv),Pair.EMPTY)
  );


   return tmp; 
}

 Object _L11(Pair Args){
   Object tmp=null; 
 tmp = 
  (Boolean.FALSE.equals(((jsint.Procedure) dynEnv.getValue((Symbol)null_63_)).apply(new Pair((( Pair) Args).getEltNover2(1),
    Pair.EMPTY)))
  ?
  new LCO(new Compile(USER_DEF, 10, new Pair( Args, this.frame), dynEnv),new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)first)).apply(new Pair((( Pair) Args).getEltNover2(1),
    Pair.EMPTY)),
    Pair.EMPTY))
  :
  _C2
  );


   return tmp; 
}

 Object _L12(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) dynEnv.getValue((Symbol)for_45_each)).apply(new Pair(dynEnv.getValue((Symbol)compile_45_file),
    new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)processCommandLineArgs)).apply(new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)array_45__62_list)).apply(new Pair((((Pair) ((this.frame).nth(1 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY)),
    Pair.EMPTY)));

tmp = new LCO(_J10/* System.exit */,new Pair(_C11,
    Pair.EMPTY));


   return tmp; 
}

 Object _L13(Pair Args){
   Object tmp=null; 
 tmp = new LCO(new Compile(USER_DEF, 12, new Pair( Args, this.frame), dynEnv),Pair.EMPTY);


   return tmp; 
}

 Object _L14(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) dynEnv.getValue((Symbol)display)).apply(new Pair(((jsint.Procedure) _J13/* .contents$ */).apply(new Pair((((Pair) ((this.frame).nth(0 ))).getEltNover2(1)),
    Pair.EMPTY)),
    Pair.EMPTY));

tmp = new LCO(dynEnv.getValue((Symbol)newline),Pair.EMPTY);


   return tmp; 
}

 Object _L15(Pair Args){
   Object tmp=null; 
 tmp = new LCO(_J14/* .printStackTrace */,new Pair((((Pair) ((this.frame).nth(0 ))).getEltNover2(1)),
    Pair.EMPTY));


   return tmp; 
}

 Object _L16(Pair Args){
   Object tmp=null; 
 tmp = _C13;


   return tmp; 
}

 Object _L17(Pair Args){
   Object tmp=null; 
 tmp = ((jsint.Procedure) dynEnv.getValue((Symbol)display)).apply(new Pair(((jsint.Procedure) dynEnv.getValue((Symbol)list)).apply(new Pair(_C12,
    new Pair((( Pair) Args).getEltNover2(1),
    Pair.EMPTY))),
    Pair.EMPTY));

tmp = ((jsint.Procedure) dynEnv.getValue((Symbol)newline)).apply(Pair.EMPTY);

tmp = 
  (Boolean.FALSE.equals(((jsint.Procedure) _J11/* .isInstance */).apply(new Pair(_J12/* JschemeThrowable.class */,
    new Pair((( Pair) Args).getEltNover2(1),
    Pair.EMPTY))))
  ?
  new LCO(_J0/* jsint.Procedure.tryCatch */,new Pair(new Compile(USER_DEF, 15, new Pair( Args, this.frame), dynEnv),
    new Pair(new Compile(USER_DEF, 16, new Pair( Args, this.frame), dynEnv),
    Pair.EMPTY)))
  :
  new LCO(new Compile(USER_DEF, 14, new Pair( Args, this.frame), dynEnv),Pair.EMPTY)
  );


   return tmp; 
}

 Object _L18(Pair Args){
   Object tmp=null; 
 tmp = new LCO(_J0/* jsint.Procedure.tryCatch */,new Pair(new Compile(USER_DEF, 13, new Pair( Args, this.frame), dynEnv),
    new Pair(new Compile(USER_DEF, 17, new Pair( Args, this.frame), dynEnv),
    Pair.EMPTY)));


   return tmp; 
}


 // definitions of java literals

static boolean [][] _moreApplicable__J0/* jsint.Procedure.tryCatch */ = new boolean[][]{ 
{true}

};

public static Object _J0/* jsint.Procedure.tryCatch */(Pair args){
int numargs = args.length();
Object 
    tmp=null;  // return type, for methods
    int b= -1; // index of best matching method/constructor

if ((numargs== 2)
        &&
       ((b== -1) || (_moreApplicable__J0/* jsint.Procedure.tryCatch */[ 0][b]))
        &&
       ((args.nth(0) instanceof java.lang.Object) &&
        (args.nth(1) instanceof java.lang.Object))) 
       { b = 0;}
   
    
try {
switch (b) {  
   // jump to the best matching method/constructor
    case 0: return jsint.Procedure.tryCatch(
            (java.lang.Object) args.nth(0),
            (java.lang.Object) args.nth(1) ); 

   default: // error
}
} catch(Exception e) {throw new JschemeThrowable(e);}; 
 return tmp;
}

static Object _J0/* jsint.Procedure.tryCatch */ = new Compile( JAVA_LIT, 0/* jsint.Procedure.tryCatch*/, Pair.EMPTY);


static boolean [][] _moreApplicable__J1/* jsint.compiler.Reflect.load */ = new boolean[][]{ 
{true,false},
{false,true}

};

public static Object _J1/* jsint.compiler.Reflect.load */(Pair args){
int numargs = args.length();
Object 
    tmp=null;  // return type, for methods
    int b= -1; // index of best matching method/constructor

if ((numargs== 0)
        &&
       ((b== -1) || (_moreApplicable__J1/* jsint.compiler.Reflect.load */[ 0][b]))
        &&
       (true)) 
       { b = 0;}
   
    if ((numargs== 1)
        &&
       ((b== -1) || (_moreApplicable__J1/* jsint.compiler.Reflect.load */[ 1][b]))
        &&
       ((args.nth(0) instanceof java.lang.String[]))) 
       { b = 1;}
   
    
try {
switch (b) {  
   // jump to the best matching method/constructor
    case 0: jsint.compiler.Reflect.load(); break; 
    case 1: jsint.compiler.Reflect.load(
            (java.lang.String[]) args.nth(0) ); break; 

   default: // error
}
} catch(Exception e) {throw new JschemeThrowable(e);}; 
 return tmp;
}

static Object _J1/* jsint.compiler.Reflect.load */ = new Compile( JAVA_LIT, 1/* jsint.compiler.Reflect.load*/, Pair.EMPTY);


static boolean [][] _moreApplicable__J2/* jsint.compiler.CompileReflection.load */ = new boolean[][]{ 
{true,false},
{false,true}

};

public static Object _J2/* jsint.compiler.CompileReflection.load */(Pair args){
int numargs = args.length();
Object 
    tmp=null;  // return type, for methods
    int b= -1; // index of best matching method/constructor

if ((numargs== 1)
        &&
       ((b== -1) || (_moreApplicable__J2/* jsint.compiler.CompileReflection.load */[ 0][b]))
        &&
       ((args.nth(0) instanceof java.lang.String[]))) 
       { b = 0;}
   
    if ((numargs== 0)
        &&
       ((b== -1) || (_moreApplicable__J2/* jsint.compiler.CompileReflection.load */[ 1][b]))
        &&
       (true)) 
       { b = 1;}
   
    
try {
switch (b) {  
   // jump to the best matching method/constructor
    case 0: jsint.compiler.CompileReflection.load(
            (java.lang.String[]) args.nth(0) ); break; 
    case 1: jsint.compiler.CompileReflection.load(); break; 

   default: // error
}
} catch(Exception e) {throw new JschemeThrowable(e);}; 
 return tmp;
}

static Object _J2/* jsint.compiler.CompileReflection.load */ = new Compile( JAVA_LIT, 2/* jsint.compiler.CompileReflection.load*/, Pair.EMPTY);


static boolean [][] _moreApplicable__J3/* jsint.compiler.Compiler.load */ = new boolean[][]{ 
{true,false},
{false,true}

};

public static Object _J3/* jsint.compiler.Compiler.load */(Pair args){
int numargs = args.length();
Object 
    tmp=null;  // return type, for methods
    int b= -1; // index of best matching method/constructor

if ((numargs== 1)
        &&
       ((b== -1) || (_moreApplicable__J3/* jsint.compiler.Compiler.load */[ 0][b]))
        &&
       ((args.nth(0) instanceof java.lang.String[]))) 
       { b = 0;}
   
    if ((numargs== 0)
        &&
       ((b== -1) || (_moreApplicable__J3/* jsint.compiler.Compiler.load */[ 1][b]))
        &&
       (true)) 
       { b = 1;}
   
    
try {
switch (b) {  
   // jump to the best matching method/constructor
    case 0: jsint.compiler.Compiler.load(
            (java.lang.String[]) args.nth(0) ); break; 
    case 1: jsint.compiler.Compiler.load(); break; 

   default: // error
}
} catch(Exception e) {throw new JschemeThrowable(e);}; 
 return tmp;
}

static Object _J3/* jsint.compiler.Compiler.load */ = new Compile( JAVA_LIT, 3/* jsint.compiler.Compiler.load*/, Pair.EMPTY);

public static Object _J4/* .println */(Pair Args){
  return (((jsint.Procedure)_J4/* .println */).apply(Args));}
static Object _J4/* .println */ = new JavaMethod("println", null, false);

public static java.io.PrintStream _J5/* System.out$ */( Pair Args ){
    if (Args.length() == 0) return System.out;
    else System.out.println("too many args in call to static field" +"System.out"); 
    return null; }


static Object _J5/* System.out$ */ = new Compile( JAVA_LIT, 5/* System.out$*/, Pair.EMPTY);


static boolean [][] _moreApplicable__J6/* Array.set */ = new boolean[][]{ 
{true}

};

public static Object _J6/* Array.set */(Pair args){
int numargs = args.length();
Object 
    tmp=null;  // return type, for methods
    int b= -1; // index of best matching method/constructor

if ((numargs== 3)
        &&
       ((b== -1) || (_moreApplicable__J6/* Array.set */[ 0][b]))
        &&
       ((args.nth(0) instanceof java.lang.Object) &&
        (args.nth(1) instanceof java.lang.Integer) &&
        (args.nth(2) instanceof java.lang.Object))) 
       { b = 0;}
   
    
try {
switch (b) {  
   // jump to the best matching method/constructor
    case 0: Array.set(
            (java.lang.Object) args.nth(0),
            (((Integer) (args.nth(1))).intValue()),
            (java.lang.Object) args.nth(2) ); break; 

   default: // error
}
} catch(Exception e) {throw new JschemeThrowable(e);}; 
 return tmp;
}

static Object _J6/* Array.set */ = new Compile( JAVA_LIT, 6/* Array.set*/, Pair.EMPTY);

public static Object _J7/* .startsWith */(Pair Args){
  return (((jsint.Procedure)_J7/* .startsWith */).apply(Args));}
static Object _J7/* .startsWith */ = new JavaMethod("startsWith", null, false);

public static Object _J8/* .length */(Pair Args){
  return (((jsint.Procedure)_J8/* .length */).apply(Args));}
static Object _J8/* .length */ = new JavaMethod("length", null, false);

public static Object _J9/* .substring */(Pair Args){
  return (((jsint.Procedure)_J9/* .substring */).apply(Args));}
static Object _J9/* .substring */ = new JavaMethod("substring", null, false);


static boolean [][] _moreApplicable__J10/* System.exit */ = new boolean[][]{ 
{true}

};

public static Object _J10/* System.exit */(Pair args){
int numargs = args.length();
Object 
    tmp=null;  // return type, for methods
    int b= -1; // index of best matching method/constructor

if ((numargs== 1)
        &&
       ((b== -1) || (_moreApplicable__J10/* System.exit */[ 0][b]))
        &&
       ((args.nth(0) instanceof java.lang.Integer))) 
       { b = 0;}
   
    
try {
switch (b) {  
   // jump to the best matching method/constructor
    case 0: System.exit(
            (((Integer) (args.nth(0))).intValue()) ); break; 

   default: // error
}
} catch(Exception e) {throw new JschemeThrowable(e);}; 
 return tmp;
}

static Object _J10/* System.exit */ = new Compile( JAVA_LIT, 10/* System.exit*/, Pair.EMPTY);

public static Object _J11/* .isInstance */(Pair Args){
  return (((jsint.Procedure)_J11/* .isInstance */).apply(Args));}
static Object _J11/* .isInstance */ = new JavaMethod("isInstance", null, false);

public static Object _J12/* JschemeThrowable.class */(Pair Args){
  return (((jsint.Procedure)_J12/* JschemeThrowable.class */).apply(Args));}
static Object _J12/* JschemeThrowable.class */ = JschemeThrowable.class;

public static Object _J13/* .contents$ */(Pair Args){
  return (((jsint.Procedure)_J13/* .contents$ */).apply(Args));}
static Object _J13/* .contents$ */ = new JavaField("contents", null);

public static Object _J14/* .printStackTrace */(Pair Args){
  return (((jsint.Procedure)_J14/* .printStackTrace */).apply(Args));}
static Object _J14/* .printStackTrace */ = new JavaMethod("printStackTrace", null, false);


    //static { new Compile().init();}
    }
