import java.io.*;

public class second2 {
    public static void main(String [] args){
       Console cs=System.console();
        int num=Integer.parseInt(cs.readLine());
        int temp=num;
        
         int result=0;
        while(num>0){
            int last=num%10;
            num/=10;
            result=result*10+last;
        }
       int first=result%10;
          System.out.println("First:"+first);
          System.out.println("last:"+temp%10);
    } 
}
