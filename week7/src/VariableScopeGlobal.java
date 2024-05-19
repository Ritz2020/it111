public class VariableScopeGlobal {

    final static String txt = "This is a GLOBAL variable of the VariableScopeGlobal class";

    public static void main(String[] args) {
String txt = "This is our local variable in the main method";
        System.out.println(txt);

//        we're going to print out the GLOBAL variable, take a look at how we are calling it!
        System.out.println(VariableScopeGlobal.txt);

//        call out the sub method below
        sub();
    }

    public static void sub() {
        String txt = "This is iur local variable inside our sub method";
        System.out.println(txt);
    }
}
