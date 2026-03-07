
import java.util.*;

public class panagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine().toLowerCase();

        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(str.indexOf(ch) != -1) {
                count++;
            }
        }

        if(count == 26)
            System.out.println("It is a Pangram");
        else
            System.out.println("It is not a Pangram");
    }
}