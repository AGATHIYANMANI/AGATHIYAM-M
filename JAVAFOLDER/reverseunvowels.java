import java.util.Scanner;
public class reverseunvowels {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String sen=sc.next();
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
           System.out.println(reverse);
       }
       else{
           System.out.println("-1");
       }
    }
}