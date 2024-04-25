public class MyForLoop {
    public static void main(String[] args){

//     for(int count = 0; count <= 20; count = count+2){
//         System.out.println(count)
//         };

         int count;
         for(count = 0; count <= 30; count = count+3) {
             System.out.println(count);


     }
        System.out.println("All Done");

         for(int newCount = 40; newCount > 0; newCount = newCount-1){
            if(newCount <= 10) {
                System.out.println("we are almost at blast off! Only " + newCount + " seconds away");
            } else {
                System.out.println(newCount);
            }
         } // end for loop

        System.out.println("blast off");
    }
}
