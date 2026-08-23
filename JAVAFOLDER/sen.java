import java.util.Scanner;
public class sen {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s1=sc.next();
       String s2=sc.next();
       int count=0;
       for(int i=0;i<=s1.length()-1;i++){
           for(int j=0;j<=s2.length()-1;j++){
               if(s1.charAt(i)==s2.charAt(j)){
                   count++;
               }
           }
       }
       if(count>0){
           System.out.println("yes");
       }
       else{
           System.out.println("no");
       }
}
}