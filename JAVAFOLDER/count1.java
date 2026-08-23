import java.io.*;

public class count1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] N = new int[n];
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= n - 1; i++) {
            N[i] = Integer.parseInt(br.readLine());
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
                    bw.write(N[k]);
                    bw.flush();
                    return;
                } else {
                    bw.write("-1");
                    bw.flush();
                    return;
                }

            } else if (odd > even) {
                if (N[k] % 2 == 0) {
                    bw.write(N[k]);
                    bw.flush();
                    return;
                } else {
                    bw.write("-1");
                    bw.flush();
                    return;
                }
            }
        }

    }
}
