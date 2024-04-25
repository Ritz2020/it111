public class MyOperators2 {

public static void main(String[]args) {


//    boolean tuna = true;
//    boolean bread = true;
//if(tuna == true && bread == true) {
//        System.out.println("We are having a sandwich!");
//    } else {
//        System.out.println("We are not!");
//    }

    boolean tuna = true;
    boolean bread = false;
    if (tuna == true || bread == true) {
        System.out.println("We are having some food!");
    } else {
        System.out.println("We are not having any food!");
    }

//    age - drinking age!

    int age = 17;

    if (age >= 18) {
        System.out.println("Yippy skippy, we can order an adult beverage!");
    } else {
        System.out.println("We will have a diet coke");
    }

//    amusement park roller coaster rider - smaller than 4 feet
//
//    int height = 4;
//            if (height < 4) {
//                System.out.println("You will not be able to ride the roller coaster");
//            } else {
//                System.out.println("Have a great time on the roller coaster");
//            }

    float height = 4f;
    if (height < 4) {
        System.out.println("You will not be able to ride the roller coaster");
    } else {
        System.out.println("Have a great time on the roller coaster");
    }


    }
}