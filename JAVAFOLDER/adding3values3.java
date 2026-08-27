import java.io.*;

public class adding3values3 {
    public static void main(String[] args){
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
String sentence=cs.readLine();
int leng=sentence.length()-1;
String fin="";
for(int i=0;i<=leng;i++){
   char first= sentence.charAt(i);
   int change=first+3;
   char after=(char)change;
   fin+=after;


}
pw.write(fin);
pw.flush();
    }    
}
