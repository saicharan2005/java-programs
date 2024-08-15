package interfaces;

interface Shape{
    int area();
    public String tostring();

}

class Rectangle implements Shape{
    int l,r;

    Rectangle(int l,int r){
        this.l=l;
        this.r=r;
    }
    public int area(){
         return l*r;
    }
    public String tostring(){
        return ("area="+area());
    }
}
public class Program1 {
    public static void main(String[] args) {
       Rectangle r1=new Rectangle(5, 6);
       System.out.println(r1.tostring());
    }

    
    
}
