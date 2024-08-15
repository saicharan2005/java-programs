import java.util.Scanner;

abstract class Shape1{

   int l,b,r;
   Scanner sc=new Scanner(System.in);

     abstract void PrintArea();
}

class Rec extends Shape1{
    void PrintArea(){

        System.out.println("Fing the Area of rectangle");

         System.out.print("enter l=");
        l=sc.nextInt();
         System.out.print("enter b=");
        b=sc.nextInt();

        System.out.println("Area of rectangle"+l*b);
        
    }
}
class Trin extends Shape1{
    void PrintArea(){

        System.out.println("Fing the Area of triangle");

         System.out.print("enter l=");
        l=sc.nextInt();
         System.out.print("enter b=");
        b=sc.nextInt();

        System.out.println("Area of triangle"+(0.5*l*b));
        
    }
}



 




public class Shape{
       public static void main(String[] args) {
         Rec r = new Rec();
         Trin t= new Trin();

        r.PrintArea();
        t.PrintArea();

    }
}
