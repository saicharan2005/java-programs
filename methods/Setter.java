package methods;


class Add{
    
    public int y;
    //constructor (used to initilize)
    public Add(int y){
        this.y=y;
    }
    //setter (used to modify the x)
    public void set(int y){
        this.y=y;
    }
    public void get(){
        System.out.println(this.y);
    }


}

public class Setter {
    public static void main(String[] args) {
        Add obj = new Add(6);
        obj.get();
        obj.set(5);
        obj.get();
    }
}


