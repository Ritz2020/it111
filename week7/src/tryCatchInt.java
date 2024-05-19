import java.util.Scanner;

public class tryCatchInt {
    public static void main(String[] args) {

        System.out.println("Please enter a number!!");

        try {
            int i;
            Scanner input = new Scanner(System.in);
            i = input.nextInt();
            System.out.println("Your integer is: " +i);

            System.out.println("The code is running correctly!");

        } catch(Exception e) {
            System.out.println("We have an error: " + e);
        }

    }
}
