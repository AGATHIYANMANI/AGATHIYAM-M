import java.util.*;
public class prime {
    void finals(int num){
        for(int i=2;i<num;i++){
        if(num%i==0){
            System.out.println("not prime number");
return;

        }
        
        
        }
        System.out.println("prime number");
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        prime pr=new prime();
        pr.finals(num);
    }
    
}
