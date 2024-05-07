import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {
        String specials;
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

//        input.close();
//        in the world of coffee, I need of a coffee beverage and a price
        String coffee;
        double price;
        int amount;
        double total;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");
        if(saturday || sunday) {
            System.out.println("Please enter a weekday");
            specials = input.next();
        }
        switch (specials) {

//            my case will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);

            System.out.println("How many " +coffee+ " would you like to order?");

            amount = input.nextInt();
            total = amount * price;
            if(amount == 0) {
                System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
            } else if (amount == 1) {
                System.out.println("Looks like you will be ordering only one " +coffee+ " today!");
            }else {
                System.out.print(amount+ " " +coffee+ " have been ordered totalling $");
                System.out.printf("%.2f", total);
                System.out.print(" dollars.");
                System.out.println();
            }
            }



            case "Tuesday" -> {
                coffee = "cuppchino";
                price = 4.75;
                System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);

                System.out.println("How many " +coffee+ " would you like to order?");

                amount = input.nextInt();
                total = amount * price;
                if(amount == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only one " +coffee+ " today!");
                }else {
                    System.out.print(amount+ " " +coffee+ " have been ordered totalling $");
                    System.out.printf("%.2f", total);
                    System.out.print(" dollars.");
                    System.out.println();
                }
            }


            case "Wednesday" -> {
                coffee = "Frapp";
                price = 4.25;
                System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);

                System.out.println("How many " +coffee+ " would you like to order?");

                amount = input.nextInt();
                total = amount * price;
                if(amount == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only one " +coffee+ " today!");
                }else {
                    System.out.print(amount+ " " +coffee+ " have been ordered totalling $");
                    System.out.printf("%.2f", total);
                    System.out.print(" dollars.");
                    System.out.println();
                }
            }


            case "Thursday" -> {
                coffee = "Regular Jeo";
                price = 2.75;
                System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);

                System.out.println("How many " +coffee+ " would you like to order?");

                amount = input.nextInt();
                total = amount * price;
                if(amount == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only one " +coffee+ " today!");
                }else {
                    System.out.print(amount+ " " +coffee+ " have been ordered totalling $");
                    System.out.printf("%.2f", total);
                    System.out.print(" dollars.");
                    System.out.println();
                }
            }


            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 5.75;
                System.out.println(specials + "'s coffe of the day is a " + coffee + " and the price will be $ " + price);
//            default:
//                System.out.println("problem!!!");

                System.out.println("How many " +coffee+ " would you like to order?");

                amount = input.nextInt();
                total = amount * price;
                if(amount == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                } else if (amount == 1) {
                    System.out.println("Looks like you will be ordering only one " +coffee+ " today!");
                }else {
                    System.out.print(amount+ " " +coffee+ " have been ordered totalling $");
                    System.out.printf("%.2f", total);
                    System.out.print(" dollars.");
                    System.out.println();
                }
            }

        }


    }
}
