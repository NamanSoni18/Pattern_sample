public class Half_pyramid_num {

    public static void main(String[] args) {

        int n = 5;

        // Rows
        for (int i = 1; i <= n; i++) {

            // Column
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // For Next line
            System.out.println("");

        }

    }

}
