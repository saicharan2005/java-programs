package inheritance;


class Bicycle{
    public int gear;
    public int speed;
    public Bicycle(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }

    public void applyBrake(int decrement){
        speed=speed-decrement;

    }

    public void applyspeed(int increment){
        speed=speed+increment;

    }

    public String tostring(){
        return ("no of gears = "+gear+"\n"+"speed = "+speed);
    }

}


class Mountainbike extends Bicycle{
    public int seatHeight; 
    public Mountainbike(int gear,int speed,int Height){
        super(gear,speed);
        this.seatHeight=Height;
    }

    public String tostring(){
        return (super.tostring()+"\n"+"height = "+seatHeight);
    }
} 





public class BicycleTest {
    public static void main(String[] args) {
        Bicycle obj1=new Mountainbike(3, 100, 25);
        System.out.println(obj1.tostring());
        obj1.applyBrake(40);
        System.out.println(obj1.tostring());
        obj1.applyspeed(20);
         System.out.println(obj1.tostring());
    }
}
