package inheritance;

class One{
    public void print1() {
       System.out.println("class one");
    }
}


class Two extends One{
    public void print2() {
       System.out.println("class Two");
    }
}


public class Single{
    public static void main(String[] args) {
        Two obj = new Two();
        obj.print1();
        obj.print2();
    }
}