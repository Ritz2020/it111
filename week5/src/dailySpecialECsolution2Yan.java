
import java.util.Scanner;

public class dailySpecialECsolution2Yan {

    public static void main(String[] args) {

        String specials;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day of the weekdays excluding weekends (Monday - Friday only!)");

        specials = input.next();
        int amount;
        double total;
//      String [] weekdays ={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
//        String [] weekend = {"Saturday", "saturday", "Sunday", "sunday"};
        boolean monday = specials.equalsIgnoreCase("Monday");
        boolean tuesday = specials.equalsIgnoreCase("Tuesday");
        boolean wednesday = specials.equalsIgnoreCase("Wednesday");
        boolean thursday = specials.equalsIgnoreCase("Thursday");
        boolean friday = specials.equalsIgnoreCase("Friday");
//        boolean sunday = specials.equals("Sunday");
//        boolean saturday = specials.equals("Saturday");
        String coffee = null;
        double price = 0;
        if (monday || tuesday || wednesday || thursday || friday) {

            switch (specials) {

                case "Monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                }


                case "monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                }

                case "Tuesday" -> {
                    coffee = "cuppchino";
                    price = 4.75;
                }

                case "tuesday" -> {
                    coffee = "cuppchino";
                    price = 4.75;
                }

                case "Wednesday" -> {
                    coffee = "Frapp";
                    price = 4.25;
                }

                case "wednesday" -> {
                    coffee = "Frapp";
                    price = 4.25;
                }

                case "Thursday" -> {
                    coffee = "Regular Jeo";
                    price = 2.75;
                }

                case "thursday" -> {
                    coffee = "Regular Jeo";
                    price = 2.75;
                }

                case "Friday" -> {
                    coffee = "Green Tea Latte";
                    price = 5.75;
                }

                case "friday" -> {
                    coffee = "Green Tea Latte";
                    price = 5.75;
                }
            }
            System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);

            System.out.println("How many " + coffee + "s would you like to order?");

            amount = input.nextInt();
            total = amount * price;

            if (amount == 0) {
                System.out.println("Looks like you don't like " + coffee + "! So sad!!!");
//            } else if (amount == 1) {
//                System.out.println("Looks like you will be ordering only one " + coffee + " today!");
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
                System.out.println();}
// nested switch in if else statement ends

        } else {

            while (!monday && !tuesday && !wednesday && !thursday && !friday) {
            System.out.println("Please enter a weekday excluding weekends (Monday - Friday only!)");
            specials = input.next();
            monday = specials.equalsIgnoreCase("Monday");
            tuesday = specials.equalsIgnoreCase("Tuesday");
            wednesday = specials.equalsIgnoreCase("Wednesday");
            thursday = specials.equalsIgnoreCase("Thursday");
            friday = specials.equalsIgnoreCase("Friday");


             if (monday || tuesday || wednesday || thursday || friday) {
//                String coffee = null;
//                double price = 0;
                switch (specials) {

                    case "Monday" -> {
                        coffee = "Latte";
                        price = 4.95;
                    }

                    case "monday" -> {
                        coffee = "Latte";
                        price = 4.95;
                    }

                    case "Tuesday" -> {
                        coffee = "cuppchino";
                        price = 4.75;
                    }

                    case "tuesday" -> {
                        coffee = "cuppchino";
                        price = 4.75;
                    }

                    case "Wednesday" -> {
                        coffee = "Frapp";
                        price = 4.25;
                    }

                    case "wednesday" -> {
                        coffee = "Frapp";
                        price = 4.25;
                    }

                    case "Thursday" -> {
                        coffee = "Regular Jeo";
                        price = 2.75;
                    }

                    case "thursday" -> {
                        coffee = "Regular Jeo";
                        price = 2.75;
                    }

                    case "Friday" -> {
                        coffee = "Green Tea Latte";
                        price = 5.75;
                    }

                    case "friday" -> {
                        coffee = "Green Tea Latte";
                        price = 5.75;
                    }
                }
                System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);

                System.out.println("How many " + coffee + "s would you like to order?");

                amount = input.nextInt();
                total = amount * price;

                if (amount == 0) {
                    System.out.println("Looks like you don't like " + coffee + "! So sad!!!");
//                } else if (amount == 1) {
//                    System.out.println("Looks like you will be ordering only one " + coffee + " today!");
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

             }

          }

        }
    }
}









