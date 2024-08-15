package methods;


class Test{
   //constructer
    public static int i=0;
     Test(){
        i++;
    }
    //static method

    public static int get(){
        return i;
    }
 
    //instance method
    public int m1(){
        System.out.println("m1 object");
        this.m2();
        return 1;


 } 
    //not return method
    public void m2(){
        System.out.println("m2 object");

 }
   
    
}

public class Method2 {
   public static void main(String[] args) {

    Test obj =new Test();
    System.out.println("calling m1 through obj.method(instance)");
    int x=obj.m1();
    System.out.print("m1 returns = "+x);
    System.out.println("calling get through class.method(static)");
    int y=Test.get();
    System.out.print("how many obj = "+y);
    
   }
}