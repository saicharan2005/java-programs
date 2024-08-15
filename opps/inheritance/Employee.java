package inheritance;

class Staff{
    int salary=100000;
}

class Engineer extends Staff{
    int benifits=50000;

}

public class Employee{
    public static void main(String[] args) {
        Engineer obj1= new Engineer();
         System.out.println("salary and benifits of engineer is ="+obj1.salary +" and "+obj1.benifits);

    }
}


