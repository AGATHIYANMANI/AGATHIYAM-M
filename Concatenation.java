import java.util.*;
public class Concatenation{
    public static void main(String [] args){
        System.out.println("Enter length of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int[] array=new int[n];
         for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
         }
         int[] sum=new int[2*n];
         for(int i=0;i<n;i++){
            sum[i]=array[i];
            sum[i+n]=array[i];

         }
         System.out.println("Concatenation array is:");
         System.out.println(Arrays.toString(sum));

    }
}
