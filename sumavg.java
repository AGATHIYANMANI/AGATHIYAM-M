import java.util.*;
public class sumavg {
  void cal(int n,Scanner sc){
    int total=0;
    for(int i=1;i<=n;i++){
         i=sc.nextInt();
        total+=i;
    }
    int average=total/n;
    System.out.println("Totai:"+total);
    System.out.println("Average:"+average);

  } 
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of element:");
    int n=sc.nextInt();
    sumavg sa=new sumavg();
    sa.cal(n,sc);
  } 
}
