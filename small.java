import java.util.*;
public class small {
    void cal(int a,int b,int c){
        if(a<b&&a<c){
            System.out.println(a+"is small");
        }
        else if(b<c){
             System.out.println(b+"is small");
        }
        else{
            System.out.println(c+"is small");
        }
    }public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    small cc=new small();
    cc.cal(a,b,c);
}
}
