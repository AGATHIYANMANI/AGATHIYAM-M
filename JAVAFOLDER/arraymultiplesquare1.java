import java.io.*;
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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int nums[]=new int[n];
        for(int i=0;i<=n-1;i++){
            nums[i]=sc.nextInt();

        }
        arraymultiplesquare so=new arraymultiplesquare();
       bw.readLine(so.sortedSquares(nums));
       bw.write();
    }
}
