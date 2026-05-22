import java.io.*;

public class largenum {
public static void main(String [] args) throws IOException{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write("Enter num 1 :");
    bw.flush();
    int num=Integer.parseInt(br.readLine());
    bw.write("Enter number 2 :");
    bw.flush();
    int num1=Integer.parseInt(br.readLine());
    bw.write("Enter num 3 :");
    bw.flush();
    int num2=Integer.parseInt(br.readLine());
   
    if(num>=num1&&num>=num2){
        bw.write(num + "is big");

    }else if(num1>num && num1>num2){
        bw.write(num1 + "is big");
    }
    else{
        bw.write(num2 + "is big");
    }
    bw.flush();
}    
}
