package javaAwtSwings;



import javax.swing.*;

public class Jframeswing{
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        JButton button =new JButton("click");
        button.setBounds(0,0,100,40);
        frame.add(button);

        JLabel label=new  JLabel("Premier League 2023");
        label.setBounds(50,350,100,40);
        frame.add(label);

        JTextField textfiled=new JTextField("hello worlds");
        textfiled.setBounds(350,50,100,40);
        frame.add(textfiled);


        JTextArea jtext=new JTextArea("hello worlds java programming iare\n instite of aeronautical engineering");
        jtext.setBounds(0,60,200,200);
        frame.add(jtext);

        
        
        

        frame.setSize(500,500);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}