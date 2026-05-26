import java.util.*;
public class technum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
        int temp=num;
        int cal=num%100;
        int cal1=num/100;
        int sum1=cal+cal1;
        int sum=sum1*sum1;
        if(sum==temp){
            System.out.println("THE NUMBER IS TECH NUMBER");
        }
        else{
            System.out.println("THE NUMBER IS NOT TECH NUMBER");
        }



        }
    }

