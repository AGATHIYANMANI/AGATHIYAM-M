import java.util.Scanner;
class repetiveodd {
    public boolean threeConsecutiveOdds(int[] arr) {
       
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2==1 && arr[i+1]%2==1 && arr[i+2]%2==1){
                return true;
            } 
        }
            return false;
    }
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      
}
    repetiveodd ro=new repetiveodd();
    System.out.println(ro.threeConsecutiveOdds(arr));
  }
}

