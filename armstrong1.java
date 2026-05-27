import java.io.*;
public class armstrong1 {
    void cal(int num,BufferedWriter bw)throws IOException{
        int temp=num;
        int sum=0;
        int digit=String.valueOf(num).length();
        while(num>0){
            int a=num%10;
            num/=10;
             sum+=Math.pow(a,digit);
        }
        if(sum==temp){
            bw.write(sum+"IT IS ARMSTRONG NUMBER");
        }
        else{
            bw.write(sum+"IT IS NOT ARMSTRONG NUMBER");
        }
        bw.flush();
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Enter number:");
        bw.flush();
        int num=Integer.parseInt(br.readLine());
        armstrong1 ar=new armstrong1();
        ar.cal(num,bw);
    }
}
