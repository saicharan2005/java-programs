package Exceptional;

import java.util.Scanner;

public class Numberform {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        while(true){
            try {
                num = Integer.parseInt(sc.next());
                System.out.println(num); 
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.toString());
                
            }
        }
    }
}
