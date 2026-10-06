import java.io.*;
class maxwordsinarray1 {
    public int mostWordsFound(String[] sentences) {
        int max=0;
       for(int i=0;i<sentences.length;i++){
        int count=0;
        for(int j=0;j<sentences[i].length();j++){
            if(sentences[i].charAt(j)==' '){
                count++;
            }
        }
        if(count>max){
            max=count;
        }
       }
       return max+1;
    }
    public static void main(String [] args) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] sentences=new String[n];
        for(int i=0;i<n;i++){
            sentences[i]=br.readLine();
        }
        maxwordsinarray ma=new maxwordsinarray();
        bw.write("Result:"+ma.mostWordsFound(sentences));
        bw.flush();
    }
}