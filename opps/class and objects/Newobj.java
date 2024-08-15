public class Newobj{
    String name;
    int age;
    public Newobj(String n,int a){
        this.name=n;
        this.age=a;
    }


    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    // public void print(){
    //     System.out.println("name="+this.name+" age="+this.age);
    // }

     public String tostring(){
        return ("name="+this.name+" age="+this.age);
    }



    public static void main(String[] args) {
        Newobj obj=new Newobj("cherry",18);
        // obj.print();
        System.out.println(obj.tostring());
        
    }
}