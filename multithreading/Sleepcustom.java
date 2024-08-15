package multithreading;


public class Sleepcustom extends Thread {
    @Override
    public void run() {
        try {
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
                // here i is printed for every 1000 milli seconds

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Sleepcustom t1=new Sleepcustom();
        t1.start();
       
        
    }
}