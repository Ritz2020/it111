public class LItGalPractice {

    public static void main(String[]args){

        int ccccc=0;
        float lit, gal;
        for(gal = 1; gal <= 100; gal = gal + 4){

            lit =(float) (gal * 3.79);
            if (gal == 1) {
                System.out.println(lit+ " Liters = " +gal+ " Gallon" );
//                System.out.printf("%.2f", lit);
//                System.out.print(" Liters = ");
//                System.out.printf("%.2f", gal);
//                System.out.println(" Gallon" );
//                System.out.printf("%.2f Liters = %.1f Gallon", lit, gal);
//                System.out.println();
            }
            else {
                System.out.println(lit+ " Liters = " +gal+ " Gallons" );
//                System.out.printf("%.2f", lit);
//                System.out.print(" Liters = ");
//                System.out.printf("%.1f", gal);
//                System.out.println(" Gallons" );
//                System.out.printf("%.2f Liters = %.1f Gallon", lit, gal);
//                System.out.println();
            }
            ccccc += 1;
            if(ccccc == 5){
            System.out.println();
            ccccc = 0;}

        } //end loop
        System.out.println("We are done!!!");

        }
    }


