import java.util.*;

public class voweltest {

    void test(char word) {
        char[] sentence = {'A','E','I','O','U','a','e','i','o','u'};
        int leng = sentence.length;   
        boolean isVowel = false;      

        for (int i = 0; i < leng; i++) {
            if (word == sentence[i]) {
                System.out.println("The character is vowel");
                isVowel = true;       
                break;
            }
        }

        if (!isVowel) {              
            System.out.println("It is consonant");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char word = sc.next().charAt(0);

        voweltest vo = new voweltest();
        vo.test(word);
    }
}
