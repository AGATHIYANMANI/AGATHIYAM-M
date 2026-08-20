import java.io.*;

public class count3 {
    public static void main(String[] args) {
        Console cs = System.console();
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(cs.readLine());
        int[] N = new int[n];
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= n - 1; i++) {
            N[i] = Integer.parseInt(cs.readLine());
        }
        for (int j = 0; j <= n - 1; j++) {
            if (N[j] % 2 == 0) {
                even++;
            } else if (N[j] % 2 == 1) {
                odd++;
            }
        }
        for (int k = 0; k <= n - 1; k++) {
            if (even > odd) {
                if (N[k] % 2 == 1) {
                    pw.write(N[k]);
                    pw.flush();
                    return;
                } else {
                    pw.write("-1");
                    pw.flush();
                    return;
                }

            } else if (odd > even) {
                if (N[k] % 2 == 0) {
                    pw.write(N[k]);
                    pw.flush();
                    return;
                } else {
                    pw.write("-1");
                    pw.flush();
                    return;
                }
            }
        }

    }
}
