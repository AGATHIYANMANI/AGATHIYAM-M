import java.util.*;
public class arithematic {
    int add(int a,int b){
        return a+b;
    }
    int mul(int a,int b){
        return a*b;

    }
    int sub(int a,int b){
        return a-b;
    }
    int div(int a, int b){
        return a/b;
    }
    int mod (int a,int b){
        return a%b;
    }
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
arithematic am=new arithematic();
arithematic bm=new arithematic();
arithematic c=new arithematic();
arithematic d=new arithematic();
arithematic e=new arithematic();
System.out.println(am.add(a,b));

System.out.println(bm.mul(a,b));
System.out.println(c.sub(a,b));
System.out.println(d.div(a,b));
System.out.println(e.mod(a,b));
    }
}
