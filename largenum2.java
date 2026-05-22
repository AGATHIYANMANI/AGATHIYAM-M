import java.io.Console;
public class largenum2 {
    public static void main(String [] args){
        Console cn=System.console();
        cn.printf("enter num1:");
        int n1=Integer.parseInt(cn.readLine());
        cn.printf("enter num2:");
        int n2=Integer.parseInt(cn.readLine());
        cn.printf("enter num3:");
        int n3=Integer.parseInt(cn.readLine());
        if(n1>=n2 &&n1>=n3){
            cn.printf("number %d is big",n1);
        }
        else if(n2>=n1&&n2>=n3){
            cn.printf("number %d is big",n2);

        }
        else{
            cn.printf("number %d is big",n3);
        }
       
    }
    
}
