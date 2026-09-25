import java.io.*;
class repetiveodd3 {
    public boolean threeConsecutiveOdds(int[] arr) {
       
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                return true;
            } 
        }
            return false;
    }
  public static void main(String[] args) throws IOException{

    Console cs=System.console();
    PrintWriter pw=new PrintWriter(System.out);
    int n=Integer.parseInt(cs.readLine());
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=Integer.parseInt(cs.readLine());
      
}
    repetiveodd3 ro=new repetiveodd3();
    pw.write(String.valueOf(ro.threeConsecutiveOdds(arr)));
    pw.flush();
  }
}


