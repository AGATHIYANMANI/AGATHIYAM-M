import java.util.*;
public class fibonnaci {
    int cal(int num){
        if(num==0){
            return 0;
        }
        else if(num==1){
            return 1;
        }
        else{
            return cal(num-1)+cal(num-2);
        }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fibonnaci fi=new fibonnaci();
        System.out.println("fibonnaci of "+num+ " is:"+fi.cal(num));

    }
}
