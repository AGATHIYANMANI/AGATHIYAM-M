import java.io.*;
public class compoundintrest2 {
    void cal(int P,int R,int y){
        double cc=(P* Math.pow(1+(R/100),y))-P;
        System.out.println("Compound intrest:"+cc);
    }
    
public static void main(String [] args) throws IOException{
   Console cs=System.console();
    System.out.println("Enter principle ammount:");
    int P=Integer.parseInt(cs.readLine());
    System.out.println("Enter Annual intrest:");
    int R=Integer.parseInt(cs.readLine());
    System.out.println("Enter year:");
    int y=Integer.parseInt(cs.readLine());
    compoundintrest2 cp=new compoundintrest2();
    cp.cal(P,R,y);
}    
}
