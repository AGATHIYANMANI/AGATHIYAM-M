
public class pat {
    public static void main(String[] args) {
        int rows = 4;
        int number = 1;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number for the next print
            }
            // Move to the next line
            System.out.println();
        }
    }
}
