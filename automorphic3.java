import java.io.*;
public class automorphic3{
    void find(int num) throws IOException{
        int n=num;
        int a=num*num;
        int result =0;
        while(a>99){
         int b=a%10;
         a/=10;
         result=result*10+b;
        }
        if(result==num){
            System.out.printf("AUTOMORPHIC NUMBER");
            
        }
        else{
             System.out.printf("NOT AUTOMORPHIC NUMBER");
          
        }
    }
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
System.out.printf("Enter number:");
      
        int num=Integer.parseInt(cs.readLine());
        automorphic2 nn=new automorphic2();
        nn.find(num);
    }
}
