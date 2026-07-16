import java.io.Console;

public class findbig_ternery3 {
    public static void main(String[] args){
       Console cs=System.console();
        int a=Integer.parseInt(cs.readLine());
        int b=Integer.parseInt(cs.readLine());
        int c=Integer.parseInt(cs.readLine());
        String result=(a>b&&a>c)?a+" is big":(b>c&&b>a)?b+" is big":c+" is big";
        System.out.printf("Result : %d",result);
    }
}
