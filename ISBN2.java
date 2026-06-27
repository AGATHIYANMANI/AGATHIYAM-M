import java.io.*;
public class ISBN2{
    void cal(long num) throws IOException{
        int sum=0;
        long temp=0;
        long org=num;
        while(num>0){
            for (int i=1;i<11;i++){
                 temp=num%10;
                sum+=i*temp;
                num/=10;
            }
        }
        if(sum%11==0){
        System.out.println(org+"is ISBN number");
       
        }
        else{
            System.out.println(org+"is not ISBN number");
           
        }

    }
    public static void main(String []args) throws IOException{
        Console cs=System.console();
        long num=Integer.parseInt(cs.readLine());
        ISBN2 isbn=new ISBN2();
        isbn.cal(num);




    }
}