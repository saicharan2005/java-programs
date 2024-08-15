package Exceptional;
public class Trycatch1{
    public static void main(String[] args) {
        try {
            int arr[]=new int[4]; 
            int i=arr[4];
        } catch (Exception e) {
        System.out.println("exception="+e);
    }
    System.out.println("hello executed");      
    }

    

}
