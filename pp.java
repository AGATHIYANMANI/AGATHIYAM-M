import java.util.*;
class pp{
    void cal(int num){
        if((num & 1)==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pp pg=new pp();
        pg.cal(num);

    }
}
