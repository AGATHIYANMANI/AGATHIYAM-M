import java.util.Scanner;
public class check {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int K=sc.nextInt();
       int[] array=new int[N];
       for(int i=0;i<N;i++){
           array[i]=sc.nextInt();
           if(array[i]==K){
               System.out.println("yes");
               return;
           }
           
       }
       System.out.println("no");
    }
}