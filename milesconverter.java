import java.util.*;
public class milesconverter{
    void cal(double kilo){
        double miles= kilo* (0.62137);
        System.out.println("MILES:"+miles);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double kilo=sc.nextDouble();
    milesconverter so=new milesconverter();
 so.cal(kilo);
}
}