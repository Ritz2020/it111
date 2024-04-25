public class LiterGallonConvert {
    public static void main(String[]args){
        float lit, gal;
        for(gal = 1; gal <= 100; gal = gal + 4){

            lit =(float) (gal * 3.79);
            if (gal == 1) {
//                System.out.println(lit+ " Liters = " +gal+ " Gallon" );
//                System.out.printf("%.2f", lit);
//                System.out.print(" Liters = ");
//                System.out.printf("%.2f", gal);
//                System.out.println(" Gallon" );
                System.out.printf("%.2f Liters = %.1f Gallon", lit, gal);
                System.out.println();
            } else if((gal+5) % 5 == 2){

//                System.out.println(lit+ " Liters = " +gal+ " Gallons" );
                System.out.printf("%.2f", lit);
                System.out.print(" Liters = ");
                System.out.printf("%.1f", gal);
                System.out.println(" Gallons" );
                System.out.println( );
            }
            else {
//                System.out.println(lit+ " Liters = " +gal+ " Gallons" );
                System.out.printf("%.2f", lit);
                System.out.print(" Liters = ");
                System.out.printf("%.1f", gal);
                System.out.println(" Gallons" );
            }
        } //end loop
        System.out.println("We are done!!!");
    }
}
