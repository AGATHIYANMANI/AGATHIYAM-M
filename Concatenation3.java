import java.io.*;
import java.util.Arrays;
public class Concatenation3 {
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
        System.out.printf("Enter length of array");

        int n=Integer.parseInt(cs.readLine());
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=Integer.parseInt(cs.readLine());

        }
        int[] sum=new int[2*n];
        for(int i=0;i<n;i++){
            sum[i]=array[i];
            sum[i+n]=array[i];
        }  
        int[] result=new int[2*n];
        
        System.out.printf("THE CONCATENATION IS:");
        
        System.out.println(Arrays.toString(sum));  
         
           
    }
    
}

