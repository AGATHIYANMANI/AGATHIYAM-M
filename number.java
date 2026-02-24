import java.util.*;
public class number {
    number(int num){
        if(num==0){
            System.out.println("zero");
        }
        else if(num==1){
            System.out.println("one");
        }
        else if(num==2){
            System.out.println("Two");
        }
        else if(num==3){
            System.out.println("Three");
        }
        else if(num==4){
            System.out.println("Four");
        }
        else if(num==5){
            System.out.println("Five");
        }
        else if(num==6){
            System.out.println("SIX");
        }
        else if(num==7){
            System.out.println("Seven");
        }
        else if(num==8){
            System.out.println("Eight");
        }
        else if(num==9){
            System.out.println("NINE");
        }
        else if(num==10){
            System.out.println("TEN");
        }

    }
    public static void main(String [] args){
        System.out.println("Enter number o to 10:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        number scm=new number(num);
    }
}
