import java.io.*;
public class ATM3{
    void cal(int opt,int balance,Console cs) throws IOException{
    
        if(opt==1){
            System.out.printf("ENTER AMOUNT TO WITHDRAW");
           
            int num=Integer.parseInt(cs.readLine());
            balance=balance-num;
            System.out.printf(" $ %d IS SUCCESSFULLY WITHDRAWED,TAKE YOUR AMMOUNT.....",num);
            
        }
            else if(opt==2){
               System.out.printf("ENTER AMOUNT TO DEPOSIT");
                
               int num=Integer.parseInt(cs.readLine());
                balance=balance+num;
            }
            else if(opt==3){
                System.out.printf("THE TOTAL BALANCE:%d",balance);
                
            }
            
            
            
        
    }
        public static void main(String [] args) throws IOException{
            Console cs=System.console();

             System.out.printf("\n1. WITHDRAW");
           
             System.out.printf("\n2.CREDIT");
          
             System.out.printf("\n3. check balance");
             
             
            
            int opt=Integer.parseInt(cs.readLine());
            int balance=5000;
            ATM3 cc=new ATM3();
            cc.cal(opt,balance,cs);
        }
    
}