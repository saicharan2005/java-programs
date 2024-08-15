package multithreading;

public class Deadlock {
    public static void main(String[] args) {
        try {
            System.out.println("thread dead lock");
            Thread.currentThread().join();

            //after join(enteredinto dead lock) after this nothing will execute 
            System.out.println("hello");
    
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) 
        {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
