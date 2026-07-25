import java.io.*;

public class even10splace1 {
    public static void main(String []args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        int tensdigit=num/100;
        int seperate=tensdigit%10;
        String result=(seperate%2==0)?"the tense digit of an number is 'even'":"the tense digit of an number is 'odd'";
        bw.write("Result: "+result);
        bw.flush();
    }
}
