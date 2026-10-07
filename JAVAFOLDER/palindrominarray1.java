import java.io.*;

class palindrominarray1 {
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }
        palindrominarray pa = new palindrominarray();

        bw.write("Result:" + pa.firstPalindrome(words));
        bw.flush();

    }
}