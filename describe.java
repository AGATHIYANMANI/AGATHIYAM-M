import java.util.*;
public class describe {
    void cal(String txt){
       int len=txt.length();
       int count=0;
       for(int i=0;i<len;i++){
        char num=txt.charAt(i);
        if(num=='o'){
          count+=1;
         }
       else{
        System.out.println("no o are presented");
          break;
        }
       
    } 
     System.out.println(count); 
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
describe ds=new describe();
ds.cal(txt);
}    
}
