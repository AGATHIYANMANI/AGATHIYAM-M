import java.io.*;
class Solution {
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
        PrintWriter pw=new PrintWriter(System.out);
        pw.write("Enter number of rows:");
        pw.flush();
        int n=sc.nextInt();
        pw.write("Enter number of column:");
        pw.flush();
        int m=sc.nextInt();
        int[][] accounts=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                accounts[i][j]=sc.nextInt();

            }
        }
        
        Solution so=new Solution();
         pw.write(so.maximumWealth(accounts));
         pw.flush();
        
    }
}
