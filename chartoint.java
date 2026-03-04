import java.util.*;
public class chartoint {
    void cal(char a){
        System.out.println("character:"+a);
        int b=a;
        System.out.println("integer:"+b);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        chartoint cc=new chartoint();
        cc.cal(a);

    }
}
