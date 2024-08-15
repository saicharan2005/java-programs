public class Conversions {
    public static void main(String[] args) {
        String s="hello";
        //tobuilder
        StringBuilder s1=new StringBuilder(s);
        s1.append("world");
        System.out.println(s1);
        //to buffer
        StringBuffer s2=new StringBuffer(s);
        s2.append("world");
        System.out.println(s2);
        //builder to s
        String s3=s1.toString();
        System.out.println(s3);
        //buffer to s
        String s4=s2.toString();
        System.out.println(s4);
        //builder to buffer
        String  s5=s1.toString();
        StringBuffer s6=new StringBuffer(s5);
        System.out.println(s6);
    }
}
