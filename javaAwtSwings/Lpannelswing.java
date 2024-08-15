package javaAwtSwings;

import java.awt.*;
import javax.swing.*;


public class Lpannelswing  extends JFrame{
    static JFrame f;
    static JButton b1,b2,b3;
    static JLabel l1;

   public static void main(String[] args) {
    f=new JFrame("panel");
    

   

    b1=new JButton("button1");
    b1.setBounds(30,10,100,20);
    

    b2=new JButton("button2");
    b2.setBounds(140,10,100,20);
    

    b3=new JButton("button1");
    b1.setBounds(30,10,100,20);
    

    l1=new JLabel("hello workds");
    
    JPanel p=new JPanel();
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(l1);
    p.setBackground(Color.red);
    p.setVisible(true);

    f.add(p);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);




    
    
   } 
}
