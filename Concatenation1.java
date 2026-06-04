import java.io.*;
import java.util.Arrays;
public class Concatenation1 {
    public static void main(String [] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Enter length of array");
        bw.flush();
        int n=Integer.parseInt(bf.readLine());
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=Integer.parseInt(bf.readLine());

        }
        int[] sum=new int[2*n];
        for(int i=0;i<n;i++){
            sum[i]=array[i];
            sum[i+n]=array[i];
        }  
        bw.write("THE CONCATENATION IS:");
        bw.flush();
        bw.write(Arrays.toString(sum));  
        bw.flush(); 
           
    }
    
}
