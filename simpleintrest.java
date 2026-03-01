import java.util.*;
public class simpleintrest{
    void cal(int P,int T,int R){
        int SI=(P*T*R)/100;
        System.out.println("simple intrest:"+SI);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle ammount:");
        int P=sc.nextInt();
        System.out.println("enter time taken:");
        int T=sc.nextInt();
        System.out.println("enter rate:");
        int R=sc.nextInt();
        simpleintrest ss=new simpleintrest();
        ss.cal(P,T,R);

    }
}