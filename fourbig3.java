import java.io.*;
public class fourbig3 {
    void cal(int a,int b,int c,int d)throws IOException{
        if(a>b&&a>c&&a>d) {
            System.out.printf("%d is big",a);
        }
        else if(b>c&&b>c){
            System.out.printf("%d is big",b);
            
        }
        else if(c>d){
            System.out.printf("%d is big",c);
           
        }
        else{
            System.out.printf("%d is big",d);
           
        }
    }
        public static void main(String [] args) throws IOException{
          Console cs=System.console();
            
            int a=Integer.parseInt(cs.readLine());
            int b=Integer.parseInt(cs.readLine());
            int c=Integer.parseInt(cs.readLine());
            int d=Integer.parseInt(cs.readLine());
            fourbig3 bb=new fourbig3();
            bb.cal(a,b,c,d);
        }
    }

