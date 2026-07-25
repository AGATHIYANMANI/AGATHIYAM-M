import java.io.Console;

public class even10splace2 {
     public static void main(String []args){
      Console cs=System.console();
        int num=Integer.parseInt(cs.readLine());
        int tensdigit=num/100;
        int seperate=tensdigit%10;
        String result=(seperate%2==0)?"the tense digit of an number is 'even'":"the tense digit of an number is 'odd'";
        System.out.println("Result: "+result);
    }
}
