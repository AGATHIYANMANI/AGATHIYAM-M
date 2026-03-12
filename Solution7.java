import java.util.*;
class Solution7 {
    public boolean isPalindrome(int x) {
        int temp=x;
        int result=0;
        while(x>0){
            int a=x%10;
            result=result*10+a;
            x/=10;

        }
        if(result==temp){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
Solution7 ss=new Solution7();
System.out.println(ss.isPalindrome(x));
    }
} 
