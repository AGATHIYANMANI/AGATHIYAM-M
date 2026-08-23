import java.util.Scanner;
public class leave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
      
       if(s=="saturday"|| s=="sunday"){
           System.out.println("yes");
           
       }
       
       else{
           System.out.println("no");
       }
    }
}