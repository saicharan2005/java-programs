class Person1{

    String name;
    int age;

    Person1(String name, int age){
       this.name=name;
       this.age=age;

    }
}


class Emp extends Person1{
    Emp(String name, int age){
        super(name, age);
    }
    void ShowDetails(){
       System.out.println("name="+name+" age="+age);
    }

}


public class Person {
    public static void main(String[] args) {
        Emp e= new Emp("charan",19);
        e.ShowDetails();
    }
}
