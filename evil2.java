import java.io.*;
public class evil2{
    void cal(int num) throws IOException{
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
    public static void main(String [] args) throws IOException{
       Console cs=System.console();
        int num=Integer.parseInt(cs.readLine());
        evil2 ee=new evil2();
        ee.cal(num);

    }
}