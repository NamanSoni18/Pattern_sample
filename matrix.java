import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j;
        int[][] mat1 = new int[20][20];
        int[][] mat2 = new int[20][20];
        int[][] sum = new int[20][20];
        System.out.print("Enter the number of rows(between 1 to 100): ");
        int r = sc.nextInt(); // Taking input from the user
        System.out.print("Enter the number of columns(between 1 to 100): ");
        int c = sc.nextInt(); // Taking input from the user
        System.out.println("Enter value of First Matix: \n");
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                System.out.print("Enter a " + i + j + " : ");
                mat1[i][j] = sc.nextInt(); // Taking matrix 1 input from the user
            }
        }
        System.out.println("Enter value of Second Matrix\n");
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                System.out.print("Enter b " + i + j + " : ");
                mat2[i][j] = sc.nextInt(); // Taking matrix 2 input from the user
            }
        }
        System.out.println("");
        System.out.println("Addition of two matrices is: ");
        // printf("\n");
        for (i = 1; i <= r; i++) {
            System.out.println("");
            for (j = 1; j <= c; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print("\t " + sum[i][j]);
            }
        }
    }

}