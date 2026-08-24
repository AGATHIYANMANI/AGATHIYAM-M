import java.util.Scanner;
public class squardigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int last=num%10;
            num/=10;
            int mul=last*last;
            sum+=mul;
            
        }
        System.out.println(sum);
    }
}