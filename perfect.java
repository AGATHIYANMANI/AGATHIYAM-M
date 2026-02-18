import java.util.*;
public class perfect {
    void find(int num){
        int temp=num;
        int total=0;
        for (int i=1;i<=num-1;i++){
        if(num%i==0){
            total+=i;
        }
    }
    if(temp==total){
        System.out.println("it is perfect number");
    }
    else{
        System.out.println("not perfect number");
    }

    }
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
perfect pr=new perfect();
pr.find(num);
    }
}
