import java.io.*;
public class ATM1{
    void cal(int opt,int balance,BufferedWriter bw,BufferedReader br) throws IOException{
    
        if(opt==1){
            bw.write("ENTER AMOUNT TO WITHDRAW");
            bw.flush();
            int num=Integer.parseInt(br.readLine());
            balance=balance-num;
            bw.write("AMOUNT IS SUCCESSFULLY WITHDRAWED,TAKE YOUR AMMOUNT.....");
            bw.flush();
        }
            else if(opt==2){
                bw.write("ENTER AMOUNT TO DEPOSIT");
                bw.flush();
               int num=Integer.parseInt(br.readLine());
                balance=balance+num;
            }
            else if(opt==3){
                bw.write("THE TOTAL BALANCE:"+balance);
                bw.flush();
            }
            
            
            
        
    }
        public static void main(String [] args) throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

             bw.write("\n1. WITHDRAW");
             bw.flush();
             bw.write("\n2.CREDIT");
             bw.flush();
             bw.write("\n3. check balance");
             bw.flush();
             
            
            int opt=Integer.parseInt(br.readLine());
            int balance=5000;
            ATM1 cc=new ATM1();
            cc.cal(opt,balance,bw,br);
        }
    
}