import java.util.*;
public class array {
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int total=0;
        int[] number=new int[5];
        for(int i=0;i<=4;i++){
            number[i]=sc.nextInt();
total+=number[i];
        }
        System.out.println("total:"+total);
    }
}
