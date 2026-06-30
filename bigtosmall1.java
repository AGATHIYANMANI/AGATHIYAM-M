import java.io.*;

public class bigtosmall1 {
    
    public static void main(String [] args) throws IOException{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    char character =br.readLine().charAt(0);
    int number=((int)character+32);
    char result=(char)number;

bw.write("The small of "+character+" is "+result);
bw.flush();
    }
}
