import java.util.*;
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0 && i%7==0){
                sum+=i;
                continue;

            }
            else if(i%3==0 && i%5==0){
                sum+=i;
                continue;
            }
            else if(i%5==0 && i%7==0){
                sum+=i;
                continue;
            }
            else if(i%3==0 && i%7==0){
                sum+=i;
                continue;
            }
            else if(i%3==0){
                sum+=i;
                continue;

            }
            else if( i%5==0 ){
                sum+=i;
                continue;
            }
            else if (i%7==0){
                sum+=i;
                continue;
            }

        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution ss=new Solution();
       System.out.println(ss.sumOfMultiples(n));
    }
}
