import java.util.*;
class student{
    void calculation(int science,int maths,int social,int tamil,int english){
        int average=(science+maths+social+tamil+english)/5;
        System.out.println("average of student"+average);
        if(average<=35){
            System.out.println("need additional class");
                }
                else{
                    System.out.println("Your study is good");
                }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter science marks");
        int science=sc.nextInt();
        System.out.println("Enter maths marks");
        int maths=sc.nextInt();
        System.out.println("Enter socialscience marks");
        int social=sc.nextInt();
        System.out.println("Enter tamil marks");
        int tamil=sc.nextInt();
        System.out.println("Enter english marks");
        int english=sc.nextInt();
        student st=new student();
        System.out.println("student category:");
        st.calculation(science, maths, social, tamil, english);

    }
}



