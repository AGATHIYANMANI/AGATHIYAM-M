import java.io.*;
public class automorphic1{
    void find(int num,BufferedWriter bw) throws IOException{
        int n=num;
        int a=num*num;
        int result =0;
        while(a>99){
         int b=a%10;
         a/=10;
         result=result*10+b;
        }
        if(result==num){
            bw.write("AUTOMORPHIC NUMBER");
            bw.flush();
        }
        else{
             bw.write("NOT AUTOMORPHIC NUMBER");
             bw.flush();
        }
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       bw.write("Enter number:");
       bw.flush();
        int num=Integer.parseInt(br.readLine());
        automorphic1 nn=new automorphic1();
        nn.find(num,bw);
    }
}
