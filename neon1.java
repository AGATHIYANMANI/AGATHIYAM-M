import java.io.*;
public class neon1{
    void cal(int num,BufferedWriter bw) throws IOException{
        int sq=num*num;
        int temp=num;
        int sum=0;
        while(sq>0){
            int a=sq%10;
            sq/=10;
            sum+=a;
        }
        if(sum==temp){
            bw.write(temp+" is neon number");
        }
        else{
            bw.write(temp+"is not neon number");
        }
        bw.flush();
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Enter number:");
        bw.flush();
        int num=Integer.parseInt(br.readLine());
        neon1 n1=new neon1();
        n1.cal(num,bw);
    }
}