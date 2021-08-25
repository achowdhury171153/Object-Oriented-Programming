package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame extends JFrame{
    JLabel l= new JLabel("loveeee");
    JLabel l2= new JLabel("loveeee second no");
    MyFrame(){
        super("hello bangladesh ");
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());  //eksathe onk gula label add korle
        setSize(300,300);
        //setLocationRelativeTo(null);
        setLocation(100,000);  //screen size position
        // setBounds(300,300,100,300);  //setSize and setLocation together

        l.setText("ashraf");
        Font f= new Font("Ariel", Font.BOLD, 40);  //FONT.Italic
        l.setFont(f);
        setResizable(false); // resize kra  jabenah window tah
        add(l);
        add(l2);
    }
}

class Image extends JFrame{
    JLabel l;   JLabel l2;
    ImageIcon ii;
    JButton b;
    Image(){
        super("Image ");


        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          //eksathe onk gula label add korle
        setSize(800,800);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout()); //flowwise layout add hbe
        setLayout(null);  //sob layout er position bole dite hobe
        //setLocation(300,000);  //screen size position

        ii= new ImageIcon("G:\\assignment\\lectureJAVADay\\src\\images\\2 (1).jpg");
        l = new JLabel(ii);
        //add(l);
        //pack();  //full images

        l2 = new JLabel("Ami hotash");
        add(l2);
        Font font= new Font("Ariel", Font.BOLD, 10);
        //button...............
        b = new JButton("Click");
        //b.setIcon(ii);  //add image in button

        b.setBounds(10,10,100,100);
        b.setForeground(Color.BLACK);
        b.setBackground(Color.YELLOW);
        b.setFont(font);
        b.setOpaque(true);
        l2.setBounds(100,100,100,100);
        add(b);
       // b.addActionListener(new A()); //anonymous chara!
        b.addActionListener(new ActionListener() {   //anonymous die
            @Override
            public void actionPerformed(ActionEvent e) {
               // System.out.println("hiiiiii hellow?");
                setTitle("love to do this");
            }
        });



}
}



class A implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hiiiiii hellow?");
    }
}




class Image2 extends JFrame{
    JLabel l;   JLabel l2;
    ImageIcon ii;
    JButton b,b2,b3;
    Image2(){
        super("Image ");
        Container c= getContentPane();
        c.setBackground(Color.BLUE);

        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //eksathe onk gula label add korle
        setSize(800,800);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout()); //flowwise layout add hbe
        setLayout(null);  //sob layout er position bole dite hobe
        //setLocation(300,000);  //screen size position


        Font font= new Font("Ariel", Font.BOLD, 10);
        //button...............
        b = new JButton("Blue");
        //b.setIcon(ii);  //add image in button

        b.setBounds(10,100,100,100);
        b.setForeground(Color.BLACK);
        b.setBackground(Color.YELLOW);
        b.setFont(font);
        b.setOpaque(true);


        b2 = new JButton("Red");
        //b.setIcon(ii);  //add image in button

        b2.setBounds(300,100,100,100);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.YELLOW);
        b2.setFont(font);
        b2.setOpaque(true);

        b3 = new JButton("Yellow");
        //b.setIcon(ii);  //add image in button

        b3.setBounds(500,100,100,100);
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.YELLOW);
        b3.setFont(font);
        b3.setOpaque(true);
        //l2.setBounds(300,100,100,100);
        add(b);
        add(b2);
        add(b3);
        // b.addActionListener(new A()); //anonymous chara!
        b.addActionListener(new ActionListener() {   //anonymous die
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("love Blue");
                c.setBackground(Color.BLUE);

            }
        });
        b2.addActionListener(new ActionListener() {   //anonymous die
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("hiiiiii hellow?");
                setTitle("love RED");
                c.setBackground(Color.RED);
            }
        });
        b3.addActionListener(new ActionListener() {   //anonymous die
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("hiiiiii hellow?");
                setTitle("love Yellow");
                c.setBackground(Color.YELLOW);
            }
        });



    }
}

class Image3 extends JFrame implements ActionListener {

    JButton b1,b2,b3; Container c;
    public Image3(){
        super("Image ");
        c= getContentPane();
        //c.setBackground(Color.BLUE);

       setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //eksathe onk gula label add korle
        setSize(800,800);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout()); //flowwise layout add hbe
        //setLayout(null);  //sob layout er position bole dite hobe
        //setLocation(300,000);  //screen size position


        Font font= new Font("Ariel", Font.BOLD, 10);


        b1= new JButton("red");
        b2= new JButton("blue");
        b3=new JButton("yellow");
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hi");
        if(e.getSource() == b1){
            c.setBackground(Color.red);
        }
        if(e.getSource() == b2){
            c.setBackground(Color.blue);
        }
        if(e.getSource() == b3){
            c.setBackground(Color.yellow);
        }
    }
}



public class Test {
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;
    private JButton button2;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);

        //new MyFrame();
        new Image();
        //new Test();
    }
}
