package encapsulation;

class Person1{
    private String name;
    private int age;
    public void set(String n,int a){
        this.name=n;
        this.age=a;
    }
    public String get(){
       return ("name = "+name+" age = "+age);
    }
}
public class TestPerson {
    public static void main(String[] args) {
        Person1 p1=new Person1();
        p1.set("SaiCharan",19);
        System.out.println(p1.get());
    }
}
