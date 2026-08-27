import java.io.*;

public class adding3values1 {
     public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

String sentence=br.readLine();
int leng=sentence.length()-1;
String fin="";
for(int i=0;i<=leng;i++){
   char first= sentence.charAt(i);
   int change=first+3;
   char after=(char)change;
   fin+=after;


}
bw.write(fin);
bw.flush();
    }
}
