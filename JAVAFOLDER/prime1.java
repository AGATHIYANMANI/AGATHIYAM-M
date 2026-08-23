import java.io.*;

public class prime1 {
   
    void finals(int num,BufferedWriter bw) throws IOException{
        for(int i=2;i<num;i++){
        if(num%i==0){
            bw.write("not prime number");
return;

        }
        
        
        }
         bw.write("prime number");
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      
        int num=Integer.parseInt(br.readLine());
        prime1 pr=new prime1();
        pr.finals(num,bw);
        bw.flush();
    } 
}
