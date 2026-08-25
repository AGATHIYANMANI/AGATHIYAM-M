import java.io.*;

public class reverseunvowels1 {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       String sen=br.readLine();
       int l=sen.length()-1;
       int count=0;
       int temp=0;
       String reverse="";
       for(int i=l;i>=0;i--){
           if(sen.charAt(i)=='a'|| sen.charAt(i) =='e' ||sen.charAt(i)=='i'||sen.charAt(i)=='o'||sen.charAt(i)=='u'||sen.charAt(i)=='A'|| sen.charAt(i) =='E' ||sen.charAt(i)=='I' ||sen.charAt(i)=='O'||sen.charAt(i)=='U'){
               count++;
           }
           else{
               reverse+=sen.charAt(i);
               temp++;
           }
       }
       if(temp>0){
           bw.write("Reversed:"+reverse);
           bw.flush();
       }
       else{
           bw.write("-1");
           bw.flush();
       }
    }
}
