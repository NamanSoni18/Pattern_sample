public class Inverted_Half_pyramid_180 {
    public static void main(String[] args) {

        int m = 5;

        // Rows
        for (int i = m; i >= 1; i--) {

            // Spaces
            for (int j = 1; j <= m - i; j++) {
                System.out.print("  ");
            }

            // For Asterik
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println("");

        }

    }

}
