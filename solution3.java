import java.util.*;
class Solution3 {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n>0){
            int a=n%10;
            n/=10;
            product*=a;
            sum+=a;
        }
        return product-sum;
    }
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Solution3 ss=new Solution3();
            int result=ss.subtractProductAndSum(n);
            System.out.println(result);
        }
    }

