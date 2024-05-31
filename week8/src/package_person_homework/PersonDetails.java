package package_person_homework;



public class PersonDetails {
//    this file will have a main method

    public static void main(String[] args) {

        package_person_homework.Person firstPerson;
        package_person_homework.Person secondPerson;
        package_person_homework.Person thirdPerson;
//     in the process of creating an object from my Person class

        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();
//        we will be entering the info, assigning the values to our fields

        firstPerson.name = "Cathy White ";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2016;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Brown";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2020;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate1 = 0;
        double adjustedRate2 = 0;


        firstPerson.display();

        System.out.println("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + " dollars");
        System.out.print("Adjustments: $" );
        System.out.println(firstPerson.assumeGender(adjustedRate1) + firstPerson.assumeCarYear(adjustedRate2));
        System.out.print(firstPerson.name + "'s Total Monthly Rate is $" );
        System.out.println(+ firstPerson.getRate(monthlyRate) + firstPerson.assumeGender(adjustedRate1) + firstPerson.assumeCarYear(adjustedRate2));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate) + " dollars");
        System.out.print("Adjustments: $" );
        System.out.println(secondPerson.assumeGender(adjustedRate1) + secondPerson.assumeCarYear(adjustedRate2));
        System.out.print(secondPerson.name + "'s Total Monthly premium is $" );
        System.out.println( secondPerson.getRate(monthlyRate) + secondPerson.assumeGender(adjustedRate1) + secondPerson.assumeCarYear(adjustedRate2));
        System.out.println();

       
    }
}
