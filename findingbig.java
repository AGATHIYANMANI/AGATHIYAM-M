import java.util.*;
public class findingbig {
    void cal(int a,int b,int c){
        if(a>=b&&a>=c){
            System.out.println("A is BIG");
        }
        else if(b>=a&&b>=c){
            System.out.println("B is BIG");
        }
        else{
            System.out.println("C is BIG");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        findingbig bg=new findingbig();
        bg.cal(a,b,c);
    }
}
