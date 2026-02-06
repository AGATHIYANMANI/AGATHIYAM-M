import java.util.*;
class score{
    String ifelse(int a,int y){
        if(a<=50){
           return "you need to improve ";
        }
        else if(a>50 && a<70){
            return "good job!";
        }
        else{
            return "excellent";
        }
    }

    public static void main(String [] args){
        System.out.println("=========even or odd program===========");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
     score ob=new score();
     String result=ob.ifelse(a);
     System.out.println(result);

    }
}
