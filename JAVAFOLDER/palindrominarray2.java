import java.io.*;

class palindrominarray2 {
    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String orginal = words[i];
            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }
            if (orginal.equals(reverse)) {
                return orginal;

            }

        }
        return "";
    }

    public static void main(String[] args) {
        Console cs = System.console();
        int n = Integer.parseInt(cs.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = cs.readLine();
        }
        palindrominarray pa = new palindrominarray();

        System.out.println("Result:" + pa.firstPalindrome(words));

    }
}