import java.util.*;
public class adding3values{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /* 
        char n=sc.next().charAt(0);
        int num=n;
        int change=num+3;
        char ne=(char)change;
System.out.println(ne);
*/
String sentence=sc.next();
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