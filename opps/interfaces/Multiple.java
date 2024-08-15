package interfaces;

 interface Api {
   default void show(){
     System.out.println("default api");
   }
    
}
interface x1 extends Api{
    void print();

}
interface x2 extends Api{
    void display();

}




public class Multiple implements x1,x2 {
    @Override
    public void print() {
        System.out.println("interface x1 print()");
    }
    
    @Override
    public void display() {
        System.out.println("interface x2 display()");
    }

    public static void main(String[] args) {
        Multiple obj1=new Multiple();
        obj1.show();
        obj1.print();
        obj1.display(); 
    }
}
