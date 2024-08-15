package Exceptional;

import java.util.Scanner;

class NotequalException extends Exception{
    NotequalException(String s){
        super(s);
    }
    
    
}
public class  Notequal{
    public static void main(String[] args) {
        try{

            Scanner sc= new Scanner(System.in);
            float n= sc.nextFloat();
            if(n!=(float) 3.14)throw new NotequalException("not equal to 3.14");

            
        }
        catch(NotequalException e){
            System.out.println(e.getMessage());
        }
    }

}

