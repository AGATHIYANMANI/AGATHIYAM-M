import java.io.*;
class Solutionbig2 {
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
        Console cs=System.console();
        System.out.println("Enter number of rows:");
        int n=Integer.parseInt(cs.readLine());
        System.out.println("Enter number of column:");
        int m=Integer.parseInt(cs.readLine());
        int[][] accounts=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                accounts[i][j]=Integer.parseInt(cs.readLine());

            }
        }
        
        Solution so=new Solution();
        so.maximumWealth(accounts);
        
    }
}
