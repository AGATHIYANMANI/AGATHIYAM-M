import java.util.*;
public class even10splace {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int tensdigit=num/100;
        int seperate=tensdigit%10;
        String result=(seperate%2==0)?"the tense digit of an number is 'even'":"the tense digit of an number is 'odd'";
        System.out.println("Result: "+result);
    }
}
