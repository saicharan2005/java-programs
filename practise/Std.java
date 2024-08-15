package practise;

import java.util.Scanner;

class Student{
    public int roll;
    public String name;

    Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
}

public class Std {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Student st[]=new Student[10];
        st[0]=new Student(0,"hello");

        for(int i=1;i<st.length;i++){
            st[i]=new Student(sc.nextInt(), sc.nextLine());
        }

        for(int i=0;i<st.length;i++){
            System.out.println(st[i].roll+ "=="+ st[i].name);
        }
        

    }
}
