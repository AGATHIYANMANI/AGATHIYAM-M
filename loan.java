import java.util.*;
public class loan {
 void employee(int salary,int age,int loans){
    if(salary>=20000|| age<=25){
       
    if(loans<=50000){
           System.out.println("you are eligible for loan.");
        }
        else if(loans>=50000){
            System.out.println("maximum loan amount is 50,000");
        }

    }
    else{
        System.out.println("you are not eligible.");
    }

   
}
public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter salary:");
    int salary=sc.nextInt();
    System.out.println ("Enter age:");
    int age=sc.nextInt();
    System.out.println("enter loan ammount:");
    int loans=sc.nextInt();
    loan lo=new loan();
    lo.employee(salary,age,loans);


}
}