import java.util.Scanner;
public class cubic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int B=sc.nextInt();
        int H=sc.nextInt();
        int total=2*((L*B)+(L*H)+(B*H));
        System.out.print(total+" ");
        System.out.print(L*B*H);
        
    }
}