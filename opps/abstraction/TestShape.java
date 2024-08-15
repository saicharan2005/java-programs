package abstraction;

abstract class Shape{
    String color;
     //these are abstract methods only decleration details are available
    abstract double area();
    public abstract String toString();


    public Shape(String c){

        this.color=c;
    }


    public String getcolor(){
        return color;
    }
}


class Circle extends Shape{
      double radius;
      public  Circle(String c ,double r) {
        super(c);
        this.radius=r;
      }  

      double area(){
        return 3.14*radius*radius;
      }

       public String toString(){
        return "circle color ="+super.getcolor()+"and area="+area();
      }
}


class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(String c,int l,int b){

        super(c);
        this.length=l;
        this.breadth=b;
    }


    double area(){
        return length*breadth; 
    }

    public String toString(){
        return "rectangle color="+super.getcolor()+"and area="+area();
    }
}


public class TestShape{
    public static void main(String[] args) {
       
          Shape s1 =new Circle("red",5);
          Shape s2 =new Rectangle("blue",3,4);

          System.out.println(s1.toString());
          System.out.println(s2.toString());

    }
}


