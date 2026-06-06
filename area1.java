import java.io.*;

public class area1 {
    void rectangle(int length,int breadth,BufferedWriter bw) throws IOException{
        bw.write("Area of rectangle:"+(length*breadth));
        bw.flush();
    }
    void circle(int radius,BufferedWriter bw) throws IOException{

         bw.write("Area of circle:"+(3.14*radius*radius));
         bw.flush();
    }
    void triangle(int breadth,int height,BufferedWriter bw) throws IOException{
         bw.write("Area of triangle:"+(breadth*height));
     bw.flush();
    }
    
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        bw.write("\nenter 1 for RECTANGLE");
        bw.flush();
        bw.write("\nenter 2 for CIRCLE");
        bw.flush();
        bw.write("\nenter 3 for TRIANGLE");
        bw.flush();
        bw.write("\nenter your shapes:");
        bw.flush();
        
        int shape=Integer.parseInt(br.readLine());
        area1 ar=new area1();
        
       
        
        if(shape==1){
            int length=Integer.parseInt(br.readLine());
            int breadth=Integer.parseInt(br.readLine());
            ar.rectangle(length,breadth,bw);
        }
        else if(shape==2){
            int radius=Integer.parseInt(br.readLine());
             ar.circle(radius,bw);
        }else if(shape==3){
            int breadth=Integer.parseInt(br.readLine());
            int height=Integer.parseInt(br.readLine());
            ar.triangle(breadth,height,bw);
        }

    }
}
    

