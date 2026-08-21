import java.io.Console;
public class repeatcount2 {
    public static void main(String[] args) {
        Console cs=System.console();
        String S=cs.readLine();
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
