package inheritance;
class One{
    public void print1(){
     System.out.println("class one ");
    }
}

class Two extends One{
    public void print2(){
     System.out.println("class Two ");
    }
}
class Three extends Two{
    public void print3(){
     System.out.println("class Three");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Three obj=new Three();
        obj.print3();
        obj.print2();
        obj.print1();
    }
}
