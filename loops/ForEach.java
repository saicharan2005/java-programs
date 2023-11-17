
public class ForEach {
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        for(int var:a){
            System.out.println(var);
        }
        for (int num :a) 
        {
            // only changes num, not the array element
            num = num*2; 
            System.out.println(num);
        }
        for(int var:a){
            System.out.println(var);
        }
            
        
    }
}
