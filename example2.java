import java.io.*;
public class example2 {
public static void main(String [] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int num=Integer.parseInt(br.readLine());
   int temp=num;
    int total=0;
    while(num>0){
        int first=num%10;
        total=(total*10)+first;
        num/=10;

    }
    if(temp%2==0 && num%2==0){
        bw.write("Even");
        bw.flush();
    }
    else if(temp%2==0 || num%2==0){
        bw.write("partial Even");
        bw.flush();
    }
    else{
       bw.write("Odd");
       bw.flush();
    }
   
}
}