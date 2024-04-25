public class celciusFarCoverter {
    public static void main (String[] args) {
//        far = (cel * 9/5) + 32

        for(int cel = 0; cel <= 100; cel = cel+3) {
            int far = (cel * 9/5) + 32;
            System.out.println(cel + " degrees Celcius is equal to " +far+ " degrees Farenheit.");

        } //end for loop
        System.out.println("All Done");
    }
}
