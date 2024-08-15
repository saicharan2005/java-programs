package interfaces;

interface X1{
    void m1();
    void m2();
}

interface X2 extends X1{
    void m3();
}


public class Extending  implements X2{
    @Override
    public void m1() {
        System.out.println("method 1");
    }
    @Override
    public void m2() {
        System.out.println("method 2");
    }

    @Override
    public void m3() {
        System.out.println("method 3");
    }

    public static void main(String[] args) {
        Extending obj1=new Extending();
        obj1.m1();
        obj1.m2();
        obj1.m3();
    }
    
}
