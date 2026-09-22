import java.util.*;
class arraymultiplesquare {
    public int[] sortedSquares(int[] nums) {
        int[] storage=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        storage[i]=nums[i]*nums[i];
        
       }
       Arrays.sort(storage);
       return storage;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<=n-1;i++){
            nums[i]=sc.nextInt();

        }
        arraymultiplesquare so=new arraymultiplesquare();
        System.out.println(so.sortedSquares(nums));
    }
}
