import java.util.Scanner;
public class repeatcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int n=S.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(S.charAt(i)==S.charAt(j)){
                    count+=2;
                }
            }
        }
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("-1");
        }
    }
}