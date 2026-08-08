import java.io.*;

public class example4 {
    
    public static void main(String [] args){
    Console cs=System.console();
    PrintWriter pw=new PrintWriter(System.out);
    int num=Integer.parseInt(cs.readLine());
   int temp=num;
    int total=0;
    while(num>0){
        int first=num%10;
        total=(total*10)+first;
        num/=10;

    }
    if(temp%2==0 && num%2==0){
        pw.write("Even");
        pw.flush();
    }
    else if(temp%2==0 || num%2==0){
        pw.write("partial Even");
        pw.flush();
    }
    else{
        pw.write("Odd");
        pw.flush();
    }
   
}
}
