import java.io.*;
public class fourbig1 {
    void cal(int a,int b,int c,int d,BufferedWriter bw)throws IOException{
        if(a>b&&a>c&&a>d) {
            bw.write(a+"is big");
            bw.flush();
        }
        else if(b>c&&b>c){
            bw.write(b+"is big");
            bw.flush();
        }
        else if(c>d){
            bw.write(c+"is big");
            bw.flush();
        }
        else{
            bw.write(d+"is big");
            bw.flush();
        }
    }
        public static void main(String [] args) throws IOException{
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            int a=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int c=Integer.parseInt(br.readLine());
            int d=Integer.parseInt(br.readLine());
            fourbig1 bb=new fourbig1();
            bb.cal(a,b,c,d,bw);
        }
    }

