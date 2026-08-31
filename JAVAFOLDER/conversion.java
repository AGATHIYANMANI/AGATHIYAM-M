import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length()-1;
        String ff="";
        for(int i=0;i<=n;i++){
            char first=str.charAt(i);
            if(first>=65 && first<=90){
            int num=(int)first+32;
            char nn=(char)num;
            ff+=nn;
            
        }
        else if(first>=97 && first<=122){
            int num=(int)first-32;
             char nn=(char)num;
            ff+=nn;
        }
        
    }
    System.out.println(ff);
}
}