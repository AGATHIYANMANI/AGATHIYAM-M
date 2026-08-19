import java.util.Scanner;
public class find{
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<=N-1;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int j=0;j<=N-1;j++){
            if(arr[j]==K){
                System.out.println(j+1);
                count++;
                return;
            }
           
            
        }
        if(count==0){
            System.out.println("-1");
        }
    }
}
