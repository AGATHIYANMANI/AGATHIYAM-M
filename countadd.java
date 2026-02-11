import java.util.*;
public class countadd {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
            System.out.println(i);
            count+=1;
                   }
            
    }
    System.out.println("total odd  number:"+count);
    }
}
