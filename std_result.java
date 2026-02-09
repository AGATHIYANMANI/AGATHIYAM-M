import java.util.*;
public class std_result {
    void totals(Scanner sc){
            int total=0;
             System.out.println("Enter tamil marks:");
               int tamil=sc.nextInt();
             System.out.println("Enter english marks:");
               int english=sc.nextInt();
             System.out.println("Enter maths marks:");
               int maths=sc.nextInt();
             System.out.println("Enter science marks:");
               int science=sc.nextInt();
             System.out.println("Enter social marks:");
               int social=sc.nextInt();
            total=tamil+english+maths+science+social;
            float average= (float)total/5;
         System.out.println("total:"+total);
         System.out.println("average:"+average);
            if(average>=40){
                 System.out.println("result:PASS");
                  if(average>=90){
                     System.out.println("grade:O");
                               }
                   else if(average>=80 && average<=89){
            System.out.println("grade:A+");

              }
            else if(average>=70&&average<+79){
            System.out.println("grade:A");
             }
            else if(average>=60&&average<=69){
            System.out.println("grade:B+");
            }
            else if(average>=50 && average<=59){
            System.out.println("grade:B");
            }
         else if(average>=40 &&average<=49){
            System.out.println("grade:O");
         }
        }
         else{
            System.out.println("result:FAIL");
            System.out.println("grade:U");
         }

    }
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        std_result re=new std_result();
        re.totals(sc);
       



    }
}
