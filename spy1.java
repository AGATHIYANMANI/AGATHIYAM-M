import java.io.*;
public class spy1 {
    void cal(int n,BufferedWriter bw) throws IOException{
        int sum=0;
       int product=1;
        while(n>0){
            int a=n%10;
            n/=10;
            sum+=a;
            product*=a;
        }
        if(sum==product){
            bw.write("IT IS SPY  NUMBER");
            bw.flush();
    
        }
        else{
            bw.write("IT IS NOT SPY NUMBER");
            bw.flush();
        }
        
    }
    
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Enter number:");
        bw.flush();
        int n=Integer.parseInt(br.readLine());
        spy1 s1=new spy1();
        s1.cal(n,bw);


        

    }
}
