public class NoSunshine{
   public static void main(String[]args){
      String b = "And this house just ain't no home\n";
      String c = "I know\n";
      n();
      p("It's not warm when she's away\n");
      n();
      p("And she's always gone too long\n");
      a();
      p("Wonder this time where she's gone\n");
      p("Wonder if she's gone to stay\n");
      n();
      p(b);
      a();
      p("And ");
      i();
      i();
      i();
      p(c);
      for(int x=0;x<4;x++){
         i();
         i();
         i();
         i();
         p(c);
      }
      i();
      p(c);
      p("hey, I ought to leave young thing alone\n");
      p("But ain't no sunshine when she's gone, whoa-whoa");
      n();
      p("Only darkness every day");
      n();
      p(b);
      a();
      a();
      a();
      a();
   }public static void p(String t){
      System.out.print(t);
   }public static void n(){
      p("Ain't no sunshine when she's gone\n");
   }public static void a(){
      p("Anytime she goes away\n");
   }public static void i(){
      p("I know, ");
   }
}