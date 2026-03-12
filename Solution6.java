import java.util.*;
class Solution6 {

    public int reverse(int x) {
        int result=0;
     while(x!=0){
        int a=x%10;
        
        result=result*10+a;
        x/=10;

     }
     return result;
        }
        public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution6 sol=new Solution6();
        int result=sol.reverse(x);
        System.out.println(result);
        
    }
}
