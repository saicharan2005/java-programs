package interfaces;


 interface Fi{
    final int x=10;

    void display();


    
}
public class Final implements Fi {
    public void display(){
        System.out.println("hello wolrd");
    }
     public static void main(String[] args) {
        Final obj=new Final();
        obj.display();
        System.out.println(obj.x);
        
     }
}
