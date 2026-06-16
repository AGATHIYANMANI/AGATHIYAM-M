import java.io.*;
public class evil1{
    void cal(int num,BufferedWriter bw) throws IOException{
        String nuum=Integer.toBinaryString(num);
        System.out.println(nuum);
        int count=0;
        int n=nuum.length();
        for(int i=0;i<n;i++){

            if(nuum.charAt(i)=='1'){
                count+=1;
            }
         
           
        }
         if(count%2==0){
               bw.write("It is evil number");
               bw.flush();
            }
            else{
                bw.write("It is not evil number");
                bw.flush();
            }
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        evil1 ee=new evil1();
        ee.cal(num,bw);

    }
}