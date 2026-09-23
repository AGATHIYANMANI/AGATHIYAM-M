import java.util.*;
class Solutionbig {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int[] result=new int[n];

       for(int i=0;i<accounts.length;i++){
        int sum=0;
        for(int j=0;j<accounts[i].length;j++){
          sum+=accounts[i][j];
    
        }
        result[i]=sum;

       }
       Arrays.sort(result);
       return result[result.length-1]; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        System.out.println("Enter number of column:");
        int m=sc.nextInt();
        int[][] accounts=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                accounts[i][j]=sc.nextInt();

            }
        }
        
        Solution so=new Solution();
        so.maximumWealth(accounts);
        
    }
}
