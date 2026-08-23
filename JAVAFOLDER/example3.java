import java.io.*;

public class example3{
    public static void main(String [] args){
    Console cs=System.console();
    int num=Integer.parseInt(cs.readLine());
   int temp=num;
    int total=0;
    while(num>0){
        int first=num%10;
        total=(total*10)+first;
        num/=10;

    }
    if(temp%2==0 && num%2==0){
        System.out.println("Even");
    }
    else if(temp%2==0 || num%2==0){
        System.out.println("partial Even");
    }
    else{
        System.out.println("Odd");
    }
   
}
}