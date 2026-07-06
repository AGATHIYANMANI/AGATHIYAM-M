import java.io.*;
import java.util.Arrays;
public class arraysort1 {
   
    public static void main(String[] args) throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n=Integer.parseInt(br.readLine());
        int nums[]=new int[n];
        for(int i=0;i<=n-1;i++){
            nums[i]=Integer.parseInt(br.readLine());

        }
        bw.write("Unsorted Array:"+Arrays.toString(nums));
        bw.flush();
        Arrays.sort(nums);
        bw.write("Sorted Array:"+ Arrays.toString(nums));
        bw.flush();
    }
}


