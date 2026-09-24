public class NoSunshine{
public static void main(String[]args){
String b="And this house just ain't no home\n";
String c="I know\n";
String n="Ain't no sunshine when she's gone\n";
String a="Anytime she goes away\n";
String i="I know, ";
v(n,"It's not warm when she's away\n",n,"And she's always gone too long\n");
p(a);
v("Wonder this time where she's gone\nWonder if she's gone to stay\n",n,b,a);
p("And ");
v(i,i,i,c);
for(int x=0;x<4;x++){
v(i,i,i,i);
p(c);
}
v(i,c,"Hey, I ought to leave young thing alone\n","But ain't no sunshine when she's gone, whoa-whoa");
v(n,"Only darkness every day",n,b);
v(a,a,a,a);
}public static void p(String t){
System.out.print(t);
}public static void v(String j,String k,String l,String m){
p(j);
p(k);
p(l);
p(m);
}
}