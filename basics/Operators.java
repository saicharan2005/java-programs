public class Operators{
    public static void main(String[] args){
        int a=10,r;
        int b=5;
        boolean x =true;
        boolean y =false;



        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        System.out.println("post in="+(a++));
        System.out.println("pre in="+(++a));
        System.out.println("post de="+(b--));
        System.out.println("pre de="+(--b));
        System.out.println("a+=3="+(a+=3));
         System.out.println("a-=3="+(a-=3));
          System.out.println("a*=3="+(a*=3));
           System.out.println("a/=3="+(a/=3));
         System.out.println("a==b="+(a==b));
        System.out.println("a!=b="+(a!=b));
        System.out.println("a<=b="+(a<=b));
        System.out.println("a>=b"+(a>=b));
        System.out.println("x&&y"+(x&&y));
         System.out.println("x || y"+(x||y));
          
        r=a>b ?a: b;
         System.out.println("great="+r);
         System.out.println("a&b="+(a&b));
        System.out.println("a|b="+(a|b));
        System.out.println("a^b="+(a^b));
        System.out.println("~b="+(~b));
        System.out.println("a<<1"+(a<<1));
        System.out.println("a>>1"+(a>>1));
    }
}