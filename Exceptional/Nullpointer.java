package Exceptional;

public class Nullpointer {
      public static void main(String[] args) {
        String s = null;
        try {
            if(s.equals("gfg")){
                System.out.println("same");
            }
            else{
                System.out.println("not same");
            }
        } catch (NullPointerException e) {
             System.out.println(e.getMessage());
        }
    //     catch (NullpointerException e) {
    //         System.out.println(e.toString());
    //    }
    //    catch (NullpointerException e) {
    //     e.printStackTrace();
//    }

      }
}
