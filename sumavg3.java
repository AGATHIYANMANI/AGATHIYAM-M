
import java.io.*;
public class sumavg3 {
  void cal(int n,Console cs) throws IOException{
    int total=0;
    for(int i=1;i<=n;i++){
         i=Integer.parseInt(cs.readLine());
        total+=i;
    }
    int average=total/n;
  System.out.printf("Total:%d",total);
   
  System.out.printf("Average:%d",average);
  

  } 
  public static void main(String [] args) throws IOException{
   Console cs=System.console();
     System.out.printf("Enter number of element:");
   
    int n=Integer.parseInt(cs.readLine());
    sumavg3 sa=new sumavg3();
    sa.cal(n,cs);
  } 
}