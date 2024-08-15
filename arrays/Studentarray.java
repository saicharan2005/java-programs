import java.util.Scanner;



class Student{
    public int roll;
    public  String name;
    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

}

public class Studentarray {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] std = new Student[6];
        std[0] =new Student(1, "charan");
        std[1] =new Student(2, "Anish");
        std[2] =new Student(3, "rahul");
        for(int i=3;i<std.length;i++){
            std[i]=new Student(sc.nextInt(),sc.nextLine());
        }
        
        for(int i=0;i<std.length;i++){
           System.out.println(std[i].roll+"=="+ std[i].name);
        }
        
    }
    
}
 