// for direct printing stars in 4 rows and 5 columns
public class solid_pattern {
    public static void main(String[] args) {
        
        // Row
        for(int i=1;i<=4;i++) {

            // Column
            for(int j = 1;j<=5;j++) {
                System.out.print("* ");
            }

            // for next line
            System.out.println(""); 
        }
    }
}