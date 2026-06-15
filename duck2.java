import java.io.*;
public class duck2{
    void cal(String sen,int n) throws IOException{
        for(int i=0;i<n;i++){
        if(sen.charAt(0)=='0'){
            System.out.println("It is not duck number");
    
            return;
        }
        else{
            System.out.println("It is duck number");
            return;
        }
        }
    }
    public static void main(String [] args) throws IOException{
    Console cs=System.console();
        String sen=cs.readLine();
        int n=sen.length();

         duck2 dk=new duck2();
        dk.cal(sen,n);
    }
}
