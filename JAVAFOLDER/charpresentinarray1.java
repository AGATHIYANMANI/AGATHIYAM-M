import java.io.*;
import java.util.*;

public class charpresentinarray1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> result=new ArrayList<>();
        char x=br.readLine().charAt(0);
        int n=Integer.parseInt(br.readLine());
        String [] array=new String[n];
        br.readLine();
        for(int k=0;k<n;k++){
            array[k]=br.readLine();
        }
        for(int i=0;i<n;i++){
        
            for(int j=0;j<array[i].length();j++){
                if(array[i].charAt(j)==x){
                    result.add(i);
                    break;

                }
            }
        }
System.out.println(result);

    }
}
