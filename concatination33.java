import java.io.Console;

public class concatination3 {
      public static void main(String[] args){
        
        Console cs=System.console();
        int n=Integer.parseInt(cs.readLine());
        char arr[]=new char[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=cs.readLine().charAt(0);
        }
        
        String concat="";
        for(int i=0;i<=n-1;i++){
            concat+=arr[i];


        }
        System.out.printf("Concatination :%s",concat);
    }
}
