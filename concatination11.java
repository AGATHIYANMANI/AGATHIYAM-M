import java.io.*;

public class concatination1 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        char arr[]=new char[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=br.readLine().charAt(0);
        }
        String concat="";
        for(int i=0;i<=n-1;i++){
            concat+=arr[i];


        }
        bw.write(concat);
        bw.flush();
    } 
}
