import java.util.Scanner;

public class IsoscelesTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of rows for the triangle
        System.out.println("Enter the number of rows for the triangle:");
        int rows = sc.nextInt();
        
        // Loop for upper half of the triangle
        for (int i = 1; i <= rows; i++) {
            // Print spaces for left padding
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
