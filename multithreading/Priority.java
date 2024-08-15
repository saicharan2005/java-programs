package multithreading;
public class Priority extends Thread{
    public void run(){
       System.out.println("thread is "+Thread.currentThread().getState());
    } 
    public static void main(String[] args) {
        Priority t1= new Priority();
        Priority t2=new Priority();

        System.out.println("thread 1 priority="+t1.getPriority());
        System.out.println("thread 1 priority="+t2.getPriority());
      
        t1.setPriority(1);
        t2.setPriority(2);
        //after set priority ,priority will change...
  
        System.out.println("thread 1 priority="+t1.getPriority());
        System.out.println("thread 1 priority="+t2.getPriority());


        System.out.println("current"+Thread.currentThread().getName());
        System.out.println("current thread  priority="+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);

        System.out.println("current thread  priority="+Thread.currentThread().getPriority());

        Priority t3=new Priority();
        //main will come to only to thread that after created....
        
        System.out.println("thread 1 priority="+t3.getPriority());
        //10 because parent(main) will come to thread t3





        
        
    }
}
