import javax.swing.*;
import java.awt.*;

public class ShowWindow2{

    public static void main(String[] args){
//        declare our variables

        JTextField  myField1, myField2;
        JLabel myLabel1, myLabel2;

//        we are going to make them constants
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 450;

//        create a window
        JFrame window = new JFrame();

//        Scanner input = new Scanner(System.in);
//        setting the title
        window.setTitle("My Second Simple Window");

//        setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.getContentPane().setBackground(Color.pink);

        window.setLocation(500,300);
        //       closing the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//          text text-Field
        myLabel1 =new JLabel("My First Big Label!!!");
        myLabel1.setBounds(50,45,300,25);

        myField1 = new JTextField(10);
        myField1.setBounds(50,70,240,30);

        myLabel2=new JLabel("My Second Big Label!!!");
        myLabel2.setBounds(50,125,300,25);

        myField2 = new JTextField(10);
        myField2.setBounds(50,150,240,30);

        //        window.add()
        window.add(myLabel1);
        window.add(myField1);
        window.add(myLabel2);
        window.add(myField2);


        myLabel1.setFont(new Font("Times", Font.ITALIC, 15));
        myLabel2.setFont(new Font("Times", Font.BOLD, 15));
        window.setLayout(null);
//       closing the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       display the window - if we do not display the window, it will not display!
//        display the window is a boolean
        window.setVisible(true);

    }
}
