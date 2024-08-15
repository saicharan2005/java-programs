
public class Methodobj  {
    static String name;
    static int  age;

    static void set(String n,int a){
        name=n;
        age=a;
    }
    static void get(){
        System.out.println(name +" "+age);
    }

    public static void main(String[] args) {

       
        

        Methodobj.set("cherry",18);
        Methodobj.get();
    }

}
