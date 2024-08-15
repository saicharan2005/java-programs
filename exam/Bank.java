


class MainBank{
    void getintrest() {
        System.out.println(0+"%");
        
    }
}

class Sbi extends MainBank{
    void getintrest() {
        System.out.println(10+"%");
        
    }
}
class icici extends MainBank{
    void getintrest() {
        System.out.println(20+"%");
        
    }
}


public class Bank {
    public static void main(String[] args) {
         Sbi s = new Sbi();
         icici i = new icici();

        s.getintrest();
        i.getintrest();

    }
}