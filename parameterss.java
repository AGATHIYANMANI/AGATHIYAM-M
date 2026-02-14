import java.util.*;
public class parameterss {
    void find(int a){
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        parameterss fr=new parameterss();
        fr.find(sc.nextInt());
    }}

