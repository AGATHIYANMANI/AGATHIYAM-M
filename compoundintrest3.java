import java.io.*;
public class compoundintrest3{
    void cal(int P,int R,int y){
        double cc=(P* Math.pow(1+(R/100),y))-P;
        System.out.printf("Compound intrest: %f",cc);
    }
    
public static void main(String [] args) throws IOException{
   Console cs=System.console();
    System.out.printf("Enter principle ammount:");
    int P=Integer.parseInt(cs.readLine());
    System.out.printf("Enter Annual intrest:");
    int R=Integer.parseInt(cs.readLine());
    System.out.printf("Enter year:");
    int y=Integer.parseInt(cs.readLine());
    compoundintrest3 cp=new compoundintrest3();
    cp.cal(P,R,y);
}    
}
