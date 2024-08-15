package interfaces;

interface X1{
    default void m1(){
        System.out.println("default");
    }
     static void m2(){  //static method m2 in interface
        System.out.println("static");
     }
}

public class Default implements X1 {

    public static void main(String[] args) {
      Default obj=new Default(); 
      obj.m1();
      X1.m2(); //static method called with intreface

    }
    

    
}
