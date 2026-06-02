import java.io.*;
public class sumnat2{
    public static void main(String [] args) throws IOException{
        Console cn=System.console();
        System.out.printf("ENTER NUMBER:");
        int num=Integer.parseInt(cn.readLine());
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.printf("Sum of %d is:",num);
      
    }
}