import java.io.*;
public class buzz2{
    void cal(int n) throws IOException{
            if(n%7==0 || n%10==7){
                System.out.println("IT IS BUZZ NUMBER");
            }
            else{
                System.out.println("IT IS NOT BUZZ NUMBER");
            }

    }
    public static void main(String [] args) throws IOException{
       Console co=System.console();
        System.out.println("Enter number:");
        int n=Integer.parseInt(co.readLine());
        buzz2 b=new buzz2();
        b.cal(n);
    }
}