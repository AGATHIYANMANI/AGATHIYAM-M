import java.io.*;

public class space1{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        char a=' ';
        bw.write("Enter sentence:");
        bw.flush();
        String name=br.readLine();
        int count=0;
        for(int i=0;i<=name.length()-1;i++){
            if(name.charAt(i)==a){
                count++;
            }

        }
        bw.write("Sentence:"+count);
        bw.flush();

    }
}
