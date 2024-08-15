package inheritance;

class A{
   public void printa(){
         System.out.println("class A");
   }
}

class B extends A{
    public void printb(){
         System.out.println("class B");
   }
}

class C extends A{
    public void printc(){
         System.out.println("class c");
   }
}




public class Hierarcial {
    public static void main(String[] args) {
        C obj1=new C();
        obj1.printc();
        obj1.printa();

        B obj2 =new B();
        obj2.printb();
        obj2.printa();
    }
}
