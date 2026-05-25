import java.io.*;
public class table2 {
    void cal(int n,Console cn){
        for(int i=1;i<=10;i++){
            int c=i*n;
        cn.printf("\n%d X %d = %d",n,i,c);
        cn.flush();
        }

    }
    public static void main(String[] args){
    Console cn=System.console();
    cn.printf("Enter number for table:");
    int n=Integer.parseInt(cn.readLine());
    cn.flush();
    table2 t2=new table2();
    t2.cal(n,cn);

    }
    
}
