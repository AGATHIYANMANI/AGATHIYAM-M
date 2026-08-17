import java.util.*;
public class second {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
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
