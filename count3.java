import java.io.Console;

public class count3 {
     public static void main(String [] args){
       Console cs=System.console();
        System.out.printf("\nEnter length of an array");
        int n=Integer.parseInt(cs.readLine());
        System.out.printf("\nEnter value to count:");
        char k=cs.readLine().charAt(0);
        char sentence[]=new char[n];
        System.out.printf("\nEnter value one by one");
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
            System.out.printf("Total count of %c is %d",k,count);
        }
        else{
            System.out.printf("Element cannot found!");
        }

    }
}
