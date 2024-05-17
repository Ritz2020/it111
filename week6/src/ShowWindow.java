import javax.swing.*;

public class ShowWindow {

    public static void main(String[] args){
//        declare our variables
//        we are going to make them constants

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

//        create a window
        JFrame window = new JFrame();

//        Scanner input = new Scanner(System.in);
//        setting the title
        window.setTitle("My Simple Window");

//        setting the size of our window
       window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

//       closing the window and exit the program
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       display the window - if we do not display the window, it will not display!
//        display the window is a boolean
        window.setVisible(true);

    }
}
