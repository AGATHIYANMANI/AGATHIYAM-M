import java.io.Console;

public class count2 {
     public static void main(String [] args){
       Console cs=System.console();
        System.out.println("Enter length of an array");
        int n=Integer.parseInt(cs.readLine());
        System.out.println("Enter value to count:");
        char k=cs.readLine().charAt(0);
        char sentence[]=new char[n];
        System.out.println("Enter value one by one");
        for(int i=0;i<=n-1;i++){
            sentence[i]=cs.readLine().charAt(0);
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
