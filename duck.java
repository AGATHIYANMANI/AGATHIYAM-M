import java.util.*;
public class duck{
    void cal(String sen,int n){
        for(int i=0;i<n;i++){
        if(sen.charAt(0)=='0'){
            System.out.println("It is not buzz number");
            return;
        }
        else{
            System.out.println("It is buzz number");
            return;
        }
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        String sen=sc.next();
        int n=sen.length();

         duck dk=new duck();
        dk.cal(sen,n);
    }
}