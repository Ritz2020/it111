public class LiterGallonConvertFinal {
    public static void main(String[] args){

        int ccc=0;
        float lit, gal;

        for(gal = 1; gal <= 100; gal = gal + 4) {

            lit = (float) (gal * 3.76);

            if (gal == 1){
                System.out.printf("%.2f Liters = %.1f Gallon", lit, gal);
                System.out.println();
            } else {

            System.out.printf("%.2f Liters = %.1f Gallons", lit, gal);
            System.out.println();}

            ccc = ccc + 1 ;
            if(ccc== 5){
                System.out.println();
                ccc = 0;
            }

        } //end for loop

        System.out.println("We are done!!!");
    }

}
