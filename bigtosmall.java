import java.util.*;
public class bigtosmall{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    char character =sc.next().charAt(0);
    int number=((int)character+32);
    char result=(char)number;
System.out.println("The small of "+character+" is "+result);
    }
}
