import java.io.*;
class repetiveodd1 {
    public boolean threeConsecutiveOdds(int[] arr) {
       
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                return true;
            } 
        }
            return false;
    }
  public static void main(String[] args) throws IOException{

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    int n=Integer.parseInt(br.readLine());
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=Integer.parseInt(br.readLine());
      
}
    repetiveodd1 ro=new repetiveodd1();
    bw.write(String.valueOf(ro.threeConsecutiveOdds(arr)));
    bw.flush();
    
  }
}

