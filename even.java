import java.util.*;
public class even {
    void testing(int a,int b){
       
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
        int b=sc.nextInt();
even ev=new even();
ev.testing(a,b);


    }
}
