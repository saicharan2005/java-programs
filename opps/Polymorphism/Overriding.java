package Polymorphism;
class Parent{
    void print(){
        System.out.println("class One");
    }
}
 
class Child1 extends Parent{
    void print(){
        System.out.println(" Child1 class ");
    }
}
class Child2 extends Parent{
    void print(){
        System.out.println("Child2 class ");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Parent p1;
        p1=new Parent();
        p1.print();
        

        p1=new Child1();
        p1.print();

        p1=new Child2();
        p1.print();
        
    }
    
}
