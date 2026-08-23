import java.io.*;

public class even10splace3 {
    public static void main(String []args){
      Console cs=System.console();
      PrintWriter pw=new PrintWriter(System.out);
        int num=Integer.parseInt(cs.readLine());
        int tensdigit=num/100;
        int seperate=tensdigit%10;
        String result=(seperate%2==0)?"the tense digit of an number is 'even'":"the tense digit of an number is 'odd'";
       pw.write("Result: "+result);
       pw.flush();
    }
}
