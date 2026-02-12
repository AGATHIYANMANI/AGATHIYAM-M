import java.util.*;
public class mid {
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] array=new int[a];
for(int i=0;i<a;i++){
    array[i]=sc.nextInt();

}
System.out.println("mid of array:"+array[a/2]);
    }
}
