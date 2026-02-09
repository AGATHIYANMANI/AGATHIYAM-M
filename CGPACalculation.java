import java.util.*;
public class CGPACalculation {
    void CGPA(int a,Scanner sc){
        int total=0;
        int creditsum=0;
       
        
        for(int i=1;i<=a;i++){
            System.out.println("Enter subject"+i+"marks:");
            int marks=sc.nextInt();
            System.out.println("Enter subject"+i+"credit point:");
            float point=sc.nextFloat();
            total+=marks*point;
            creditsum+=point;
        }
        float cg=(float)total/creditsum;
System.out.println("the cgpa:"+cg);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many subject to calculate your CGPA:");
        int a=sc.nextInt();
       
        CGPACalculation cb=new CGPACalculation();
        cb.CGPA(a,sc);

    }
    
}
