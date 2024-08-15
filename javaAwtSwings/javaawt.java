package javaAwtSwings;

import java.awt.*;

public class javaawt{
    public static void main(String[] args) {
        Frame frame=new Frame("click me");
    Button button=new Button("click");
    button.setBounds(80,80,100,50);
    frame.add(button);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true); 

    // Label label1 = new Label("Label One", Label.LEFT);
    // Checkbox java = new Checkbox("Java");
    // Choice choice = new Choice();
    // choice.add("--select--");
    //     choice.add("Shampoo");
    //     choice.add("Eggs");
    //     choice.add("Bottles");
    // List list1 = new List(5);
    // list1.add("Shampoo");
    // list1.add("Conditioner");
    // list1.add("Eggs");
    // list1.add("Bottles");
    // list1.add("Butter");
 
    }
   
    
    
}
