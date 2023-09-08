public class floyd_Triangle {

    public static void main(String[] args) {

        int n = 5;
        int number = 1;

        // Rows
        for (int i = 1; i <= n; i++) {

            // Column
            for (int j = 1; j <= i; j++) {

                // Printing Number
                System.out.print(number + " ");
                number++; // Incrementing Values

            }

            System.out.println(""); // For Next Line

        }

    }

}
