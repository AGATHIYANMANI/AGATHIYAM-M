import java.util.*;
public class count_numbers {
    void cal(int num){
        while(num>0){
     int a=num%10;
     if(a%2==0){
        System.out.println("EVEN COUNT:"+ a);
     }
     else{
        System.out.println("ODD COUNT:"+a);
     }
     num/=10;
    }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        count_numbers co=new count_numbers();
        co.cal(num);
    }
}
