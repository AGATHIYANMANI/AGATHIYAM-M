import java.util.*;
public class sellerreading{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        String s=sc.next();
        String s2=sc.next();
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<s2.length()-1;j++){
                if(s.charAt(i)==s2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count==s.length()-1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}