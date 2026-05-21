import java.io.Console;
public class even3 {
    public static void main(String[] args){
        Console cn=System.console();
        int num=Integer.parseInt(cn.readLine());
    if(num%2==0){
        System.out.printf("NUMBER %d IS EVEN",num);
    }
else{
    System.out.printf("NUMBER %D IS odd",num);
}
}
    
}
