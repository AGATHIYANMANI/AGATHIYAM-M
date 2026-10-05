import java.util.*;
import java.io.*;

public class charpresentinarray2 {
    public static void main(String[] args){
        Console cs=System.console();
        List<Integer> result=new ArrayList<>();
        char x=cs.readLine().charAt(0);
        int n=Integer.parseInt(cs.readLine());
        String [] array=new String[n];
       cs.readLine();
        for(int k=0;k<n;k++){
            array[k]=cs.readLine();
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
