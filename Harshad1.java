import java.io.*;
public class Harshad1 {
    void find(int num, BufferedWriter bw) throws IOException{
       
        int total=0;
        while(num>0){
            int a=num%10;
              total+=a;
              num/=10;
        }
        if(num%total==0){
            bw.write("Harshad number");
            bw.flush();
        }
        else{
            bw.write("not harshad number");
            bw.flush();
        }
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());


Harshad1 hr=new Harshad1();
hr.find(num,bw);
    }
    
}
