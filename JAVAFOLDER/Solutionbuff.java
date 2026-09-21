import java.io.*;
class Solutionbuff {
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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        Solution ss=new Solution();
      bw.write(ss.sumOfMultiples(n));
    }
}
