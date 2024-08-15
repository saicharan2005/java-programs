package multithreading;

public class Runnableclass implements Runnable{
    public void run(){
        try {
            System.out.println("Thread"+Thread.currentThread().getId()+"is Running");
            
        } catch (Exception e) {
         System.out.println("Exception= "+e);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread obj=new Thread(new Runnableclass());  //since start is in Thread we ceate Thread ohject
            obj.start();
        }
    }
    
}
