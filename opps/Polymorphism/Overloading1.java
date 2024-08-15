package Polymorphism;
class Test{
    int x,y,z;
    float x1,y1;
    static int multiply(int x,int y){
        return x*y;

    }
    public float multiply(float x1,float y1){
        return x1*y1;

    }
    public int multiply(int x,int y,int z){
        return x*y*z;

    }
    


}

public class Overloading1 {
    public static void main(String[] args) {
      Test t1=new Test();
    System.out.println(Test.multiply(2, 5));
    System.out.println(t1.multiply(2,3,6)); 
    System.out.println(t1.multiply(2.3f, 2.2f));
    }
    
    
}
