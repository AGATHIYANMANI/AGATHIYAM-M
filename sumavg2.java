
import java.io.*;
public class sumavg2 {
  void cal(int n,Console cs) throws IOException{
    int total=0;
    for(int i=1;i<=n;i++){
         i=Integer.parseInt(cs.readLine());
        total+=i;
    }
    int average=total/n;
  System.out.println("Total:"+total);
   
  System.out.println("Average:"+average);
  

  } 
  public static void main(String [] args) throws IOException{
   Console cs=System.console();
     System.out.println("Enter number of element:");
   
    int n=Integer.parseInt(cs.readLine());
    sumavg2 sa=new sumavg2();
    sa.cal(n,cs);
  } 
}