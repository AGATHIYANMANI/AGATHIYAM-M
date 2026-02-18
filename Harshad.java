import java.util.*;
public class Harshad {
    void find(int num){
       
        int total=0;
        while(num>0){
            int a=num%10;
              total+=a;
              num/=10;
        }
        if(num%total==0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("not harshad number");
        }
    }
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
Harshad hr=new Harshad();
hr.find(num);
    }
    
}
