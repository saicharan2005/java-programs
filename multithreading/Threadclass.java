package multithreading;

public class Threadclass extends Thread {
    public void run(){
        try{
            System.out.println("thread "+ Thread.currentThread().getId()+"is running");
        }catch(Exception e){
            System.out.println("Exception is caught"+e);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
             Threadclass obj=new Threadclass();
         obj.start();
        }
       
    }
}
