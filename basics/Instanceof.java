public class Instanceof{
    public static void main(String[] args){
       Person obj1= new Person();
       Person obj2= new Boy();
    
    System.out.println("obj1 instanceof Person"+(obj1 instanceof Person));
     System.out.println("obj1 instanceof Boy"+(obj1 instanceof Boy));
      System.out.println("obj1 instanceof interface"+(obj1 instanceof My_interface));
       System.out.println("obj2 instanceof Person"+(obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy"+(obj2 instanceof Boy));
         System.out.println("obj2 instanceof myintreface"+(obj2 instanceof My_interface));
    }
}
class Person{
}

class Boy extends Person implements My_interface{

 }
interface My_interface{

}

