import java.util.*;
public class ATM{
    void cal(int opt,Scanner sc,int balance){
    
        if(opt==1){
            System.out.println("ENTER AMOUNT TO WITHDRAW");
            int num=sc.nextInt();
            balance=balance-num;
            System.out.println("AMOUNT IS SUCCESSFULLY WITHDRAWED,TAKE YOUR AMMOUNT.....");
        }
            else if(opt==2){
                System.out.println("ENTER AMOUNT TO DEPOSIT");
                int num=sc.nextInt();
                balance=balance+num;
            }
            else if(opt==3){
                System.out.println("THE TOTAL BALANCE:"+balance);
            }
            
            
        
    }
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("1. WITHDRAW");
             System.out.println("2.CREDIT");
             System.out.println("3. check balance");
            
            int opt=sc.nextInt();
            int balance=5000;
            ATM cc=new ATM();
            cc.cal(opt,sc,balance);
        }
    
}