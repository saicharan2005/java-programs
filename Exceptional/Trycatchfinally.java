package Exceptional;

public class Trycatchfinally {
    public static void main(String[] args) {
        int a=10,r;
        try{
            r=a/0;
        }catch(ArithmeticException e){
            System.out.println("Excepton="+e);
        }
        finally{
            System.out.println("iam finally always executed");
        }
    }
}
