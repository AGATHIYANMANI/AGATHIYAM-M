import java.io.*;
public class fourbig2 {
    void cal(int a,int b,int c,int d)throws IOException{
        if(a>b&&a>c&&a>d) {
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
        public static void main(String [] args) throws IOException{
          Console cs=System.console();
            
            int a=Integer.parseInt(cs.readLine());
            int b=Integer.parseInt(cs.readLine());
            int c=Integer.parseInt(cs.readLine());
            int d=Integer.parseInt(cs.readLine());
            fourbig2 bb=new fourbig2();
            bb.cal(a,b,c,d);
        }
    }

