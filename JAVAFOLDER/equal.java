import java.util.Scanner;
public class equal {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s1=sc.next();
       String s2=sc.next();
       int num=sc.nextInt();
       char first=s1.charAt(num);
       char second=s2.charAt(num);
       if(first==second){
          System.out.println("yes");
       }else{
            System.out.println("no");
       }
    }
}