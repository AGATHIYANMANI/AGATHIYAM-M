import java.util.*;
public class sum_arr {
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] num=new int[n];
int total=0;
        
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
            total+=num[i];

    }
    System.out.println(total);
}
}