package abstraction;



abstract class Animal{
    public String name;
    abstract String sound();
    public abstract String toString();
    public Animal(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    

}

class Dog extends Animal{
    String sound;
    public Dog(String name,String sound){
        super(name);
        this.sound=sound;
    }
    String sound(){
        return sound;
    }
    public String toString(){
        return ("name = "+getName()+"sound = "+sound());
    }
}
public class Testanimal {
    public static void main(String[] args) {
        Animal a1=new Dog("bubba","bow");
        System.out.println(a1.toString());
        
    }
}
