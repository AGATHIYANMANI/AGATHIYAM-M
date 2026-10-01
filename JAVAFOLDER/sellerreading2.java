import java.io.*;
public class sellerreading2{
    public static void main(String[] args){
        Console cs=System.console();
        int count=0;
        String s=cs.readLine();
        String s2=cs.readLine();
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