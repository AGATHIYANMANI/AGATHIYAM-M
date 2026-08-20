import java.util.Scanner;
public class count {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] N=new int[n];
    int even=0;
    int odd=0;
  for(int i=0;i<=n-1;i++){
    N[i]=sc.nextInt();
}
for(int j=0;j<=n-1;j++){
if(N[j]%2==0){
even++;
}else if(N[j]%2==1){
odd++;
}
}for(int k=0;k<=n-1;k++){
   if(even>odd){
  if(N[k]%2==1){
System.out.println(N[k]);
return;
}
else{
System.out.println("-1");
return;
}

    }
    else if(odd>even){
        if(N[k]%2==0){
            System.out.println(N[k]);
            return;
        }
        else{
            System.out.println("-1");
            return;
        }
    }
}

}
}