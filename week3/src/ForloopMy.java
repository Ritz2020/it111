public class ForloopMy {
    public static void main(String[]args){
        int count;
        for(count = 0; count<= 20; count = count+2) {
            System.out.println(count);
            System.out.println("All Done");
        }
        System.out.println("All Done");

        int newCount;
        for(newCount = 40; newCount > 0; newCount= newCount-2 ) {
            System.out.println(newCount);
        } //end for loop
        System.out.println("blast off");

        for(newCount = 40; newCount >= 0; newCount= newCount-2 ) {
            if(newCount >10) {
                System.out.println(newCount);
            } else if(newCount > 0) {
                System.out.println("We are almost at blast off! Only " +newCount+ " seconds away");

            } else {
                System.out.println("blast off");
            }
        } //end for loop

    }
}
