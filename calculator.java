import java.util.*;
public class calculator {
    int calc(char operator,int num1,int num2){
        switch(operator){
            case '+':
            
              return num1 + num2;
             
            case '-':
               return num1-num2;
              
            case '*':
            return num1*num2;
           
            case '/':
            return num1/num2;
           
            case '%':
            return num1%num2;
            default:
            return 0;
          

        }
    }
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number 1:");
    int num1=sc.nextInt();
     System.out.println("enter number 2:");
    int num2=sc.nextInt();
     System.out.println("enter number operation to perform");
     System.out.println("for add give (+)");
     System.out.println("for sub give (-)");
     System.out.println("for multiple give (*)");
     System.out.println("for division give (/)");
     System.out.println("for modulo give (%)");
     System.out.println("enter your selection:");
    char operator= sc.next().charAt(0);
    calculator cl=new calculator();
    int result=cl.calc(operator,num1,num2);
    System.out.println("result for "+ operator+" :"+result);

    }
    
}
