import java.io .*;

public class chartoint2 {
    void cal(char a) throws IOException{
      System.out.println("character:"+a);
      int b=a;
      System.out.println("integer:"+b);
      
    }
    public static void main(String [] args) throws IOException{
       Console cs=System.console();
        char a=cs.readLine().charAt(0);
        chartoint2 cc=new chartoint2();
        cc.cal(a);

    }
}
