import java.util.*;
public class compoundintrest {
    void cal(int P,int R,int y){
        double cc=(P* Math.pow(1+(R/100),y))-P;
        System.out.println("Compound intrest:"+cc);
    }
    
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter principle ammount:");
    int P=sc.nextInt();
    System.out.println("Enter Annual intrest:");
    int R=sc.nextInt();
    System.out.println("Enter year:");
    int y=sc.nextInt();
    compoundintrest cp=new compoundintrest();
    cp.cal(P,R,y);
}    
}
