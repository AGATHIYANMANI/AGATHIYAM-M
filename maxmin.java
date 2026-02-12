import java.util.*;
public class maxmin {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        

for(int i=0;i<a;i++){
    array[i]=sc.nextInt();
    System.out.println("element"+i+":"+array[i]);
}
int max=array[0];
int min=array[0];
for(int j=1;j<a;j++){
    if(array[j]>array[0]){
        max=array[j];
    }
    else if(array[j]<array[0]){
        min=array[j];
        }
}
System.out.println("max:"+max);
System.out.println("min:"+min);

    }
}
