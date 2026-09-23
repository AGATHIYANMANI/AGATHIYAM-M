import java.io.*;
class Solutionbig1 {
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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Enter number of rows:");
      bw.flush();
        int n=Integer.parseInt(br.readLine());
       bw.write("Enter number of column:");
      bw.flush();
        int m=Integer.parseInt(br.readLine());
        int[][] accounts=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                accounts[i][j]=Integer.parseInt(br.readLine());

            }
        }
        
        Solution so=new Solution();
        bw.write(so.maximumWealth(accounts));
      bw.flush();
        
    }
}
