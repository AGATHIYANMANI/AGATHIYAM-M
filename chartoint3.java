import java.io .*;

public class chartoint3 {
    void cal(char a) throws IOException{
      System.out.printf("\ncharacter:%c",a);
      int b=a;
      System.out.printf("\ninteger:%d",b);
      
    }
    public static void main(String [] args) throws IOException{
       Console cs=System.console();
        char a=cs.readLine().charAt(0);
        chartoint3 cc=new chartoint3();
        cc.cal(a);

    }
}
