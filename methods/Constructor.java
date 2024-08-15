package methods;



public class Constructor {

    public String name;
    public int age;
    //default constructor
    public Constructor(){
       System.out.println("default");
    }
    //parameterized  constructor(string)
    public Constructor(String n){
      this.name=n;
    }
    //parameterized constructor(int) diff from above
    public Constructor(int a){
        this.age=a;
    }

    //parameterized  constructor(2 parameters)
    public Constructor(String n,int a){
          this.name=n;
         this.age=a;

    }


     //copy constructor
    public Constructor(Constructor obj){
          this.name=obj.name;
         this.age=obj.age;

    }

    public static void main(String[] args) {
        // Constructor obj1 =new Constructor();//default

        Constructor obj2 =new Constructor("");
         System.out.println("name = "+obj2.name);
        Constructor obj3 =new Constructor(18);
         System.out.println("age = "+obj3.age);

         Constructor obj4 =new Constructor("cherry",18);
         System.out.println("name and age = "+obj4.name+" and "+obj4.age);


          Constructor obj5 =new Constructor(obj4);
         System.out.println("name and age copied from above object = "+obj5.name+" and "+obj5.age);


    }
}
