import java.util.*;
public class evil{
    void cal(int num){
        String nuum=Integer.toBinaryString(num);
        System.out.println(nuum);
        int count=0;
        int n=nuum.length();
        for(int i=0;i<n;i++){

            if(nuum.charAt(i)=='1'){
                count+=1;
            }
         
           
        }
         if(count%2==0){
                System.out.println("It is evil number");
            }
            else{
                System.out.println("It is not evil number");
            }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        evil ee=new evil();
        ee.cal(num);

    }
}