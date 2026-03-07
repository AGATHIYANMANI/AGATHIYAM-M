import java.util.*;
class leetcode1 {
    public int addDigits(int num) {
        while(num>9){
            int a=num%10;
             num/=10;
            num+=a;
        }
        return num;
    }
        public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
leetcode1 so=new leetcode1();
System.out.println("sum:"+so.addDigits(num));
        }
    
}