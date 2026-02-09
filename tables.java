 import java.util.*;
 public class tables {
    
    void answer(int num){
        for(int i=1;i<=20;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for tabls:");
        int num=sc.nextInt();
        tables tb=new tables();
        tb.answer(num);



    }
}
