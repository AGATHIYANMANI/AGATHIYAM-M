import java.util.*;
public class type{
    void cal(int num){
        if(num>0){
            System.out.println("postive number");
        }
        else if(num<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("Zero");
        }
    }
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
type tt=new type();
tt.cal(num);
    }
}