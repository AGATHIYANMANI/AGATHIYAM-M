import java.util.*;
public class details{
    void cal(String name,int age,int marks,char gender){
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("MARKS:"+marks);
        System.out.println("GENDER:"+gender);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();;
        int marks=sc.nextInt();
        char gender=sc.next().charAt(0);
        details de=new details();
        de.cal(name,age,marks,gender);
        
    }
}