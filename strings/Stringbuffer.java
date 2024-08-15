import java.lang.StringBuffer;
public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer("hello ");
        sc.append("java");
        String s1= sc.toString();
        System.out.println(s1);
        sc.insert(2,"java");
        System.out.println(sc);
        sc.replace(5,10,"hello ");
        System.out.println(sc);
        sc.delete(0,5);
        System.out.println(sc);
        sc.reverse();
        System.out.println(sc);
         System.out.println(sc.capacity());
        System.out.println(sc.charAt(1));
        sc.deleteCharAt(1);
         System.out.println(sc);

    }
}
