import java.util.*;

public class arraysort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<=n-1;i++){
            nums[i]=sc.nextInt();

        }
        System.out.println("Unsorted Array:"+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Sorted Array:"+ Arrays.toString(nums));
    }
}
