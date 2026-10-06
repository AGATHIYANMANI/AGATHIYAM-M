import java.io.*;
class maxwordsinarray3 {
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
    public static void main(String [] args)throws IOException{
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(cs.readLine());
        String[] sentences=new String[n];
        for(int i=0;i<n;i++){
            sentences[i]=cs.readLine();
        }
        maxwordsinarray ma=new maxwordsinarray();
       pw.write("Result:"+ma.mostWordsFound(sentences));
       pw.flush();
    }
}