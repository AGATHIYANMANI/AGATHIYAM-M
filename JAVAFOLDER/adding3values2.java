import java.io.*;

public class adding3values2 {
  public static void main(String[] args){
        Console cs=System.console();
String sentence=cs.readLine();
int leng=sentence.length()-1;
String fin="";
for(int i=0;i<=leng;i++){
   char first= sentence.charAt(i);
   int change=first+3;
   char after=(char)change;
   fin+=after;


}
System.out.println(fin);
    }  
}
