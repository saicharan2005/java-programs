public class Charfromstring {
    public static void main(String[] args) {
        String s="geek for geeks";
        char c[]=new char[s.length()];
        c=s.toCharArray();
        
        int index=2;
        System.out.println(s.charAt(index));

        for(int i=0;i<s.length();i++){
            System.out.println(c[i]);
        }

    }
}
