package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame2 extends JFrame {
    public MyFrame2(){
        super("Hello World");
        JLabel l1= new JLabel("Dhaka");
        JLabel l2= new JLabel("Mohammadpur");
         JLabel l3=new JLabel("Abdul");
        JLabel l4=new JLabel("Abdul");
        JLabel l5=new JLabel("Abdul");
        JButton b1= new JButton("Red");
        JButton b2= new JButton("Red");
        JButton b3= new JButton("Red");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        setVisible(true);
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Font f = new Font("Ariel", Font.BOLD, 20);
        l1.setFont(f);
        l2.setFont(f);
        add(l1);
        add(l2);
        add(b2);
        add(b3);
        add(b1);
        //setResizable(false);
    }
}

class ImageA extends JFrame implements ActionListener {
    JLabel l1; JLabel l2; ImageIcon ii; JButton b1,b2,b3;Container c;
    ImageA(){
        super("Image BD");
        c= getContentPane();
        //c.setBackground(Color.BLUE);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setSize(2000,1000);


        ii= new ImageIcon("G:\\assignment\\lectureJAVADay\\src\\images\\1.jpg");
        l1= new JLabel(ii);
        l1.setBounds(10,100,1000,1000);
        add(l1);
        pack();
        l2= new JLabel("Hello Dhaka");
        add(l2);

        l2.setBounds(1000,500,100,100);


        b1=new JButton("Blue");
        b2=new JButton("RED");
        b3=new JButton("Yellow");
        add(b1);

        add(b2);
        add(b3);
        Font f = new Font("Ariel", Font.ITALIC, 15);
        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.YELLOW);
        b1.setForeground(Color.WHITE);
        b1.setFont(f);
        b2.setFont(f);

        b3.setFont(f);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
/*
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("Title Changed to Blue");
                c.setBackground(Color.BLUE);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("Title Changed to RED");
                c.setBackground(Color.RED);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("Title Changed to YELLOW");
                c.setBackground(Color.YELLOW);
            }
        });

*/


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // c.setBackground(Color.RED);
        if(e.getSource() == b1){
            c.setBackground(Color.BLUE);
            //System.out.println("hello ");

        }
        if(e.getSource() == b2){

            c.setBackground(Color.RED);
        }
        if(e.getSource() == b3){
            c.setBackground(Color.YELLOW);
        }



    }
}
class AA implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        setTitle("new Title changed");
        System.out.println("hello World");
    }

    private void setTitle(String new_title_changed) {
    }
}

public class Test1{
    private JButton button1;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        //new MyFrame2();
       new ImageA();
    }

}
