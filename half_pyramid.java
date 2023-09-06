// star printing in pyramid pattern
public class half_pyramid {
    
    public static void main(String[] args) {

        // rows
        for(int i=1;i<=4;i++) {

            // columns
            for (int j=1;j<=i;j++) {

                System.out.print("* ");

            }
   
            // for next line
            System.out.println("");

        }

    }

}
