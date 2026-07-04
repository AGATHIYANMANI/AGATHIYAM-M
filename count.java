import java.util.*;
public class count {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array");
        int n=sc.nextInt();
        System.out.println("Enter value to count:");
        char k=sc.next().charAt(0);
        char sentence[]=new char[n];
        System.out.println("Enter value one by one");
        for(int i=0;i<=n-1;i++){
            sentence[i]=sc.next().charAt(0);
        }
        int count=0;
        for(int j=0;j<=n-1;j++){
            if(k==sentence[j]){
               count++;
               continue;
                            }
                            
        }
        
        if(count!=0){
            System.out.println("Total count of "+k+" is "+count);
        }
        else{
            System.out.println("Element cannot found!");
        }

    }
}
