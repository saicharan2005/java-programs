package Exceptional;

public class throw1 {
   static void age(int x)throws ArithmeticException{
    if(x<18){
        throw new ArithmeticException("less than 18 not eligile");
    }
    else{
        System.out.println("you are eligible");
    }
   }
   public static void main(String[] args) {
    age(15);
   }
}
