import java.util.Scanner;

public class emirp {
    void cal(int num){

        int original = num;
        int count = 0;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                count++;
                break;
            }
        }

        if(count != 0){
            System.out.println("it is not emirp number...");
            return;
        }

        int aga = original;
        int temp = 0;

        while(aga > 0){
            int digit = aga % 10;
            temp = temp * 10 + digit;
            aga /= 10;
        }

        int count2 = 0;
        for(int j = 2; j < temp; j++){
            if(temp % j == 0){
                count2++;
                break;
            }
        }

        if(count2 == 0 && original != temp){
            System.out.println("It is emirp number...");
        } else {
            System.out.println("it is not emirp number...");
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        emirp em = new emirp();
        em.cal(num);
    }
}
