import java.io.*;
public class sumnat1{
    public static void main(String [] args) throws IOException{
        Console cn=System.console();
        System.out.println("ENTER NUMBER:");
        int num=Integer.parseInt(cn.readLine());
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
      
    }
}