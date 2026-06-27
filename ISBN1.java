import java.io.*;
public class ISBN1{
    void cal(long num,BufferedWriter bw) throws IOException{
        int sum=0;
        long temp=0;
        long org=num;
        while(num>0){
            for (int i=1;i<11;i++){
                 temp=num%10;
                sum+=i*temp;
                num/=10;
            }
        }
        if(sum%11==0){
        bw.write(org+"is ISBN number");
        bw.flush();
        }
        else{
            bw.write(org+"is not ISBN number");
            bw.flush();
        }

    }
    public static void main(String []args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        long num=Integer.parseInt(br.readLine());
        ISBN1 isbn=new ISBN1();
        isbn.cal(num,bw);




    }
}