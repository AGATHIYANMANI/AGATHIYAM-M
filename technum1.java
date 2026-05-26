import java.io.*;
public class technum1 {
    void find(int n,BufferedWriter bw) throws IOException{
        int temp=n;
        int num=n%100;
        int num1=n/100;
        int sum=num+num1;
        int cal=sum*sum;
        if(cal==temp){
            bw.write("IT IS TECH NUMBER");
            bw.flush();
        }
        else{
            bw.write("IT IS NOT TECH NUMBER");
            bw.flush();
        }


    }
    public static void main(String [] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Enter number:");
        bw.flush();
        int n=Integer.parseInt(bf.readLine());
        technum1 tc=new technum1();
        tc.find(n,bw);
    }
}
