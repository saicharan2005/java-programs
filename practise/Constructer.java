package practise;

 class Base{
    int x;
    Base(int x1){
        x=x1;
    }


}

class  Derived extends Base{
    int y;
    Derived(int x1,int y1){
        super(x1);
        this.y=y1;
    }
    void display(){
        System.out.println(x+y);
}
    }
    

public class Constructer {
    public static void main(String[] args) {
        Derived d1= new Derived(1, 2);
        d1.display();
    }


}
