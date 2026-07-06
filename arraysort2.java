import java.io.Console;
import java.util.Arrays;


public class arraysort2 {
    public class arraysort {
    public static void main(String[] args){
       Console cs=System.console();
        int n=Integer.parseInt(cs.readLine());
        int nums[]=new int[n];
        for(int i=0;i<=n-1;i++){
            nums[i]=Integer.parseInt(cs.readLine());

        }
        System.out.println("Unsorted Array:"+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Sorted Array:"+ Arrays.toString(nums));
    }
}
}
