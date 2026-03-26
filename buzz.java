import java.util.*;
public class buzz {
    void cal(int num){
        int a=num%10;
        if(num%7==0 || a==7){
            System.out.println("IT IS BUZZ NUMBER");
        }
        else{
            System.out.println("IT IS NOT BUZZ NUMBER");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        buzz bu=new buzz();
        bu.cal(num);
    }
    
}
