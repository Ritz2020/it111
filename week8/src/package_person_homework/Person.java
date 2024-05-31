package package_person_homework;

public class Person {

//    this file does not have a main method
//    we will start typing fields (variables)

    String name;
    char gender;
    int age;
    int car;

    boolean violations;
    double creditScore;

//    currently, I can't print it because there is no method. I need to create a new method display and a new class to print it

public void display(){
    System.out.println("Customer name: " +name);
    System.out.println("Age: " +age);
    System.out.println("Gender: "+gender);
    System.out.println("Car: " +car);
    System.out.println("Violatiobs: " +violations);
    System.out.println("Creditscore: " +creditScore);



}

// our logic is regarding our credit score and violation


    public double getRate(double monthlyRate) {
    if(violations == true && creditScore <= 700) {

        monthlyRate = 500;

    } else {
        monthlyRate = 100;
    }
return monthlyRate;
    }

    public double assumeGender(double adjustedRate1){

if(gender == 'M' && age <= 25){
    adjustedRate1 = 100;
    }else {
    adjustedRate1 = 0;
}
   return adjustedRate1;
    }

    public double assumeCarYear(double adjustedRate2){

        if(car <= 2015){
            adjustedRate2 = 0;
        }else {
            adjustedRate2 = 100;
        }
        return adjustedRate2;
    }
}
