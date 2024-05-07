import java.util.Scanner;

public class MyEnum {
  enum WhoWins {HOME, VISITORS, NEITHER}
   public static void main(String[] args) {
      WhoWins who;

      int seahawks, broncos;

       Scanner input = new Scanner (System.in);
       System.out.println("Please enter the final score for the Seahawks");
       seahawks = input.nextInt();
       System.out.println("Please enter the final score for the Broncos");
       broncos = input.nextInt();

       if (seahawks > broncos) {
           who = WhoWins.HOME; //Whowins.HOME is an object of the WhoWins type
           System.out.print(who+ " team won by ");
           System.out.println( seahawks - broncos+ " points!");
           System.out.println("Seahawks win!");
       } else if (seahawks < broncos){
          who =  WhoWins.VISITORS;
           System.out.print(who+ " team won by ");
           System.out.println( broncos - seahawks+ " points!");
           System.out.println("Broncos win!");
       }else {
           who = WhoWins.NEITHER;
           System.out.println(who+ " team won!");
           System.out.println("It's a tie!");
       }


   }






}
