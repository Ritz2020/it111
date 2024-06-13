

import java.util.Scanner;

public class dailySpecialECfinalYan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String specials;
        int amount;
        double total;

        boolean inputday = true;
        String coffee = null;
        double price = 0;

        do {
            System.out.println("Please enter a day of the weekdays excluding weekends (Monday - Friday only!)");
            specials = input.next();
if ( specials.equalsIgnoreCase("Sunday") || specials.equalsIgnoreCase("Saturday"))
{
    System.out.println("Please enter a weekday, not a weekend day");
} else if (!specials.equalsIgnoreCase("Monday") && !specials.equalsIgnoreCase("Tuesday")&& !specials.equalsIgnoreCase("Wednesday") && !specials.equalsIgnoreCase("Thusday") && !specials.equalsIgnoreCase("Friday") && !specials.equalsIgnoreCase("Sunday")&& !specials.equalsIgnoreCase("Saturday")) {
    System.out.println("Please check your spelling");
}

            switch (specials) {

                case "Monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                    inputday = false;
                    System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);
                }


                case "monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                    inputday = false;
                    System.out.println("Monday's coffe of the day is a " + coffee + " and the price will be $ " + price);
                }

                case "Tuesday" -> {
                    coffee = "cuppchino";
                    price = 4.75;
                   inputday = false;
                    System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);
                }

                case "tuesday" -> {
                    coffee = "cuppchino";
                    price = 4.75;
                    inputday = false;
                    System.out.println("Tuesday's coffe of the day is a " + coffee + " and the price will be $ " + price);
                }

                case "Wednesday" -> {
                    coffee = "Frapp";
                    price = 4.25;
                    inputday = false;
                    System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);
                }

                case "wednesday" -> {
                    coffee = "Frapp";
                    price = 4.25;
                    inputday = false;
                    System.out.println("Wednesday's coffe of the day is a " + coffee + " and the price will be $ " + price);
                }

                case "Thursday" -> {
                    coffee = "Regular Jeo";
                    price = 2.75;
                    inputday = false;
                    System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);
                }

                case "thursday" -> {
                    coffee = "Regular Jeo";
                    price = 2.75;
                    inputday = false;
                    System.out.println("Thursday's coffe of the day is a " + coffee + " and the price will be $ " + price);
                }

                case "Friday" -> {
                    coffee = "Green Tea Latte";
                    price = 5.75;
                   inputday = false;
                    System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);

                }

                case "friday" -> {
                    coffee = "Green Tea Latte";
                    price = 5.75;
                    inputday = false;
                    System.out.println("Friday's coffe of the day is a " + coffee + " and the price will be $ " + price);

                }

            }
            // nested switch in if else statement ends

        } while (inputday) ;
//        end do while loop

        System.out.println("How many " + coffee + "s would you like to order?");

        amount = input.nextInt();
        total = amount * price;

        if (amount == 0) {
            System.out.println("Looks like you don't like " + coffee + "! So sad!!!");

        } else if (amount < 5) {
            System.out.print(amount + " " + coffee + "s have been ordered totalling $");
            System.out.printf("%.2f", total);
            System.out.print(" dollars. Thank you and enjoy!!");
            System.out.println();

        } else if (amount < 10) {

            System.out.print("You got a group 10% discount! Your regular price is $");
            System.out.printf("%.2f", total);
            System.out.println();
            total = amount * price * 0.9;
            System.out.print("You have ordered " + amount + " " + coffee + "s, but you will be only charged ");
            System.out.printf("%.2f", total);
            System.out.print(" dollars. Thank you and enjoy!!");
            System.out.println();

        } else {

            System.out.print("A bigger group 20% discount! Your regular price is $");
            System.out.printf("%.2f", total);
            total = amount * price * 0.8;
            System.out.println();
            System.out.print("You have ordered " + amount + " " + coffee + "s, but you will be only charged ");
            System.out.printf("%.2f", total);
            System.out.print(" dollars. Thank you and enjoy your " + coffee + " day!!!");
            System.out.println();

        }
//        end else
    }
//    end main
}
//  end class














