import java.io.Console;

public class sumeven2 {
        public static void main(String [] args){
       Console cs=System.console();
        int num1=Integer.parseInt(cs.readLine());
        int num2=Integer.parseInt(cs.readLine());
        int total=num1+num2;
        String result=(total%2==0)?"even":"odd";
        System.out.println(result);
    }
}
