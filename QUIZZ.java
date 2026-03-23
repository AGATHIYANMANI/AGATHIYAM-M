 import java.util.*;
 class QUIZZ{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOM TO QUIZZ");
        System.out.println("We can play(y/n):");
        String option=sc.nextLine();
        if(option=="yes"){
            System.out.println("java is platform dependent or not?");
            System.out.println("1.dependent   2.independent  3.none");
            int answer=sc.nextInt();
            if(answer==2){
                System.out.println("Correct Answer.");
            }
            else if(option=="n"){
                System.out.println("Wrong Answer.");
            }

        }
        else{
            System.out.println("Thank you!");
        }
    }
}