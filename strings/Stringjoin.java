import java.util.StringJoiner;

public class Stringjoin{
    public static void main(String[] args) {
        StringJoiner s1 =new StringJoiner(":");
        
        s1.add("hello");
        s1.add("world");
        System.out.println(s1.toString());
        StringJoiner s2=new StringJoiner("-");
        s2.add("charan");
        s2.add("reddy");
        System.out.println(s2.toString());
        s1.merge(s2);
        System.out.println(s1.toString());
        System.out.println(s2.length());
        
        
    }
}