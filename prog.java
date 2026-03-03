import java.util.*;
class prog{
    void cal(int num){
        if((num/2)*2==num){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        prog pg=new prog();
        pg.cal(num);

    }
}