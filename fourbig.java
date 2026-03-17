import java.util.*;
public class fourbig {
    void cal(int a,int b,int c,int d){
        if(a>b&&a>c&&a>d){
            System.out.println(a+"is big");
        }
        else if(b>c&&b>c){
            System.out.println(b+"is big");
        }
        else if(c>d){
            System.out.println(c+"is big");
        }
        else{
            System.out.println(d+"is big");
        }
    }
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            fourbig bb=new fourbig();
            bb.cal(a,b,c,d);
        }
    }

