import java.util.*;
public class findbig_ternery {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        String result=(a>b&&a>c)?a+" is big":(b>c&&b>a)?b+" is big":c+" is big";
        System.out.println("Result : "+result);
    }
}
