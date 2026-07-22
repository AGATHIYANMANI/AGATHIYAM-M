import java.io.*;

public class countrepetation1 {
    public static void main(String [] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    String sentence=br.readLine();//school
    for(int i=0;i<sentence.length();i++){
        int count=0;
        for(int j=0;j<sentence.length();j++){
        if(sentence.charAt(i)==sentence.charAt(j)){
            count++;
        }
        
    }
    bw.write("\n"+sentence.charAt(i) +"= "+count);
    bw.flush();
}
    }
}
