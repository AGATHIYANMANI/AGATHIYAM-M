import java.io.*;

public class binary3 {
    void cal(int num) throws IOException{
       System.out.printf("number:"+num);
    String a=Integer.toBinaryString(num);
    System.out.printf("Binary form is:%d",a);
    }

    public static void main(String [] args) throws IOException{
       Console cs=System.console();
        
        int num=Integer.parseInt(cs.readLine());
        binary3 bi=new binary3();
        bi.cal(num);
    }
}
