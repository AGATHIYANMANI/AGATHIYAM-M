import java.io.Console;

public class pattnum3 {
        public static void main(String[] args) {
       
        Console cs=System.console();
        int rows = Integer.parseInt(cs.readLine());
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
