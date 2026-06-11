import java.io.*;

public class binary2 {
    void cal(int num) throws IOException{
       System.out.println("number:"+num);
    String a=Integer.toBinaryString(num);
    System.out.println(a);
    }

    public static void main(String [] args) throws IOException{
       Console cs=System.console();
        
        int num=Integer.parseInt(cs.readLine());
        binary2 bi=new binary2();
        bi.cal(num);
    }
}
