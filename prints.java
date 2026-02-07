import java.util.*;
public class prints {
    void pp(int num1,int num2){

        System.out.println(num1);
        System.out.println(num2);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numer 1:");
        int num1=sc.nextInt();
        System.out.println("enter number 2:");
        int num2=sc.nextInt();
        prints ps=new prints();
        ps.pp(num1,num2);

    }
}
