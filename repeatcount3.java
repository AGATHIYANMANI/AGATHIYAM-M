import java.io.*;
public class repeatcount3 {
    public static void main(String[] args) {
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        String S=cs.readLine();
        int n=S.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(S.charAt(i)==S.charAt(j)){
                    count+=2;
                }
            }
        }
        if(count>0){
            pw.write(count);
            pw.flush();
        }
        else{
           pw.write("-1");
           pw.flush();
        }
    }
}
