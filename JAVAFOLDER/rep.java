 import java.util.Scanner;
 public class rep {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String S1=sc.next();
       int n=S1.length();
       String S2=sc.next();
       int p=S2.length();
       int total=0;
       for(int i=0;i<n;i++){
           int count=0;
           for(int j=0;j<p;j++){
               if(S1.charAt(i)==S2.charAt(j)){
                  count++;
                  break;
               }
           }
           if(count==0){
               System.out.print(S1.charAt(i));
               total++;
           }
           }
           if(total==0){
               System.out.println("-1");
               return;
       }
    }
}

