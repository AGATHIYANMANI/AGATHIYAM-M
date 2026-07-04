import java.io.*;

public class count1 {
       public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println("Enter length of an array");
        bw.flush();
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter value to count:");
        bw.flush();
        char k=br.readLine().charAt(0);
        char sentence[]=new char[n];
        System.out.println("Enter value one by one");
        bw.flush();
        for(int i=0;i<=n-1;i++){
            sentence[i]=br.readLine().charAt(0);
        }
        int count=0;
        for(int j=0;j<=n-1;j++){
            if(k==sentence[j]){
               count++;
               continue;
                            }
                            
        }
        
        if(count!=0){
            bw.write("Total count of "+k+" is "+count);
            bw.flush();
        }
        else{
            bw.write("Element cannot found!");
            bw.flush();
        }

    }
}
