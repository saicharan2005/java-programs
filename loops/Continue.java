public class Continue {
    public static void main( String[] args ){
        int x=10;
        for(int i=0;i<x;i++){
            if((i==5)||(i==8)){
                continue;
              
            }  
            System.out.println(i);
        }

         System.out.println("using while loop");
        while(x>1){
            if(x==9){
                x--;
                continue;
                
            }
            System.out.println(x);
            x=x-1;
        }
    }
}
