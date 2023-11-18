import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        switch(x){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("case 4");
                break;
                

        }

    }
}
