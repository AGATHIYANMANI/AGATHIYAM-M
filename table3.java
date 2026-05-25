import java.io.*;
public class table3 {
    void cal(int n,Console cn){
        for(int i=1;i<=10;i++){
            int c=i*n;
        System.out.println(n+"x"+i+"="+n*i);
        cn.flush();
        }

    }
    public static void main(String[] args){
    Console cn=System.console();
    System.out.println("Enter number for table:");
    int n=Integer.parseInt(cn.readLine());
    cn.flush();
    table2 t2=new table2();
    t2.cal(n,cn);

    }
    
}
