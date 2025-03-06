public class DiamondPattern {
    public static void main(String[] args) {
        // Number of rows for the upper half of the diamond
        int rows = 5;

        // Upper half of the diamond (including the middle row)
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
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

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = rows; j > i; j--) {
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
