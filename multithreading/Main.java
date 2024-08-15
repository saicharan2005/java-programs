package multithreading;
public class Main extends Thread{
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("parent thread");
        System.out.println(t.getName());
        t.setName("chichu");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setPriority(MAX_PRIORITY);
        System.out.println(t.getPriority());


        Thread st=new Thread(){
            
             public void run() {
                 // TODO Auto-generated method stub\\
            
                 System.out.println("child");
               
             }
        };

        System.out.println(st.getPriority());
        st.setPriority(MAX_PRIORITY);
        System.out.println(st.getPriority());


        st.start();
    }
}

class Child extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
       System.out.println("child Thread");
    }
} 