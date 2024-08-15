public class Diffofstrings {
    public static void Concat1(String s1){
       s1=s1+"reddy";
    }
    public static void Concat2(StringBuilder s2){
       s2.append("reddy");
    }
    public static void Concat3(StringBuffer s3){
       s3.append("reddy");
    }
    public static void main(String[] args) {
        String s1="charan ";
        Concat1(s1);
        System.out.println("Using  String class="+s1);
        StringBuilder s2= new StringBuilder("charan ");
        Concat2(s2);
        System.out.println("Using  StringBuilder class="+s2);
        StringBuffer s3=new StringBuffer("charan ");
        Concat3(s3);
        System.out.println("Using  Stringbuffer class="+s3);
    }
}
