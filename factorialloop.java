import java.util.*;
public class factorialloop {
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
        int con=1;
      for(int i=1;i<=num;i++){
        con*=i;
      }
      System.out.println(con);
    }
}
