import java.io.*;
public class ISBN3{
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
        System.out.printf(org+"%d is ISBN number",org);
       
        }
        else{
            System.out.printf("%d is not ISBN number",org);
           
        }

    }
    public static void main(String []args) throws IOException{
        Console cs=System.console();
        long num=Integer.parseInt(cs.readLine());
        ISBN3 isbn=new ISBN3();
        isbn.cal(num);




    }
}