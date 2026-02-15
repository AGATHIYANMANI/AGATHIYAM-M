import java.util.*;
public class armstrong {
    void cal(int num){
        int temp=num;
        int mass=0;
        while(num>0){
            int a=num%10;
            int sum=a*a*a;
            num/=10;
            mass+=sum;


        }
        if(mass==temp){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }


    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        armstrong ar=new armstrong();

        ar.cal(num);


        
    }
    
}
