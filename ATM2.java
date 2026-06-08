import java.io.*;
public class ATM2{
    void cal(int opt,int balance,Console cs) throws IOException{
    
        if(opt==1){
            System.out.println("ENTER AMOUNT TO WITHDRAW");
           
            int num=Integer.parseInt(cs.readLine());
            balance=balance-num;
            System.out.println("AMOUNT IS SUCCESSFULLY WITHDRAWED,TAKE YOUR AMMOUNT.....");
            
        }
            else if(opt==2){
               System.out.println("ENTER AMOUNT TO DEPOSIT");
                
               int num=Integer.parseInt(cs.readLine());
                balance=balance+num;
            }
            else if(opt==3){
                System.out.println("THE TOTAL BALANCE:"+balance);
                
            }
            
            
            
        
    }
        public static void main(String [] args) throws IOException{
            Console cs=System.console();

             System.out.println("\n1. WITHDRAW");
           
             System.out.println("\n2.CREDIT");
          
             System.out.println("\n3. check balance");
             
             
            
            int opt=Integer.parseInt(cs.readLine());
            int balance=5000;
            ATM2 cc=new ATM2();
            cc.cal(opt,balance,cs);
        }
    
}