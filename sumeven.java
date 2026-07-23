import java.util.*;
class sumeven{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int total=num1+num2;
        String result=(total%2==0)?"even":"odd";
        System.out.println(result);
    }
}