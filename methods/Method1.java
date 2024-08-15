package methods;
class Addition{
     int sum;

    public int add(int x,int y){
       sum=x+y;
       return sum;
    }
}
public class Method1 {
     public static void main(String[] args) {
        Addition obj = new Addition();
        int res=obj.add(5, 6);
        System.out.println("sum of 5 and 6 ="+res);
     }
}
