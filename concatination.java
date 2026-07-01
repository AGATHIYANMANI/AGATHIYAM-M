import java.util.*;
class concatination{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.next().charAt(0);
        }
        String concat="";
        for(int i=0;i<=n-1;i++){
            concat+=arr[i];


        }
        System.out.println(concat);
    }
}