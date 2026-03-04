import java.util.*;
public class binary{
    void cal(int num){
        System.out.println("number:"+num);
    String a=Integer.toBinaryString(num);
    System.out.println(a);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        binary bi=new binary();
        bi.cal(num);
    }
}