import java.util.*;
public class reverse {
    void rev(int num){
        int mul=0;
while(num>0){
int last=num%10;

 mul=(mul*10)+last;
 num=num/10;
}
System.out.println(mul);

    }
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
reverse rr=new reverse();
rr.rev(num);

    }
}
