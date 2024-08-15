package basic;
public class Firstoops{
    static String name;
    static int salary;
    static void set(String n,int s){
        name=n;
        salary=s;
    }

    static void get(){
        System.out.println("name ="+ name);
        System.out.println("salary ="+salary);

    }
    public static void main(String[] args) {
        Firstoops.set("charan",100000);
        Firstoops.get();
        // Firstoops x = new Firstoops();
        // x.set("charan",100000);
        // x.get()   do like this if above is public method


    }
}