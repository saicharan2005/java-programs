package abstraction;

interface Shape{
   
    double area();
    public  String toString();


}

class Rectangle implements Shape{


    double length;
    double breadth;

    public Rectangle(int length,int breadth){
   
      this.length=length;
      this.breadth=breadth;
    }
    public double area(){
       return length*breadth;

     }
     public String toString(){ 
        return ("area of rectangle ="+area());
     }
}






public class Testshape1 {
    public static void main(String[] args) {
         Rectangle obj1 =new Rectangle(10,20);
         System.out.println(obj1.toString());
    }
  
   

    
    
}
