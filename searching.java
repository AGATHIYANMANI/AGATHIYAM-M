import java.util.*;
public class searching {
void cal(Scanner sc,int a){
int[] array=new int[a];

for(int i=0;i<a;i++){
    array[i]=sc.nextInt();
}
System.out.println("enter a  key to find:");

int key=sc.nextInt();

for(int j=0;j<a;j++){

if(key==array[j]){
    System.out.println("the element at"+j);
}
else{
    continue;
}
}

}

    
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
searching se=new searching();
se.cal(sc,a);

    }
}
