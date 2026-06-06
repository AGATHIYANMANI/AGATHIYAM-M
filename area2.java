import java.io.*;

public class area2 {
    void rectangle(int length,int breadth) throws IOException{
        System.out.println("Area of rectangle:"+(length*breadth));
    }
    void circle(int radius) throws IOException{

         System.out.println("Area of circle:"+(3.14*radius*radius));
    }
    void triangle(int breadth,int height) throws IOException{
         System.out.println("Area of triangle:"+(breadth*height));
    }
    
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
        
        System.out.println("\nenter 1 for RECTANGLE");
        
        System.out.println("\nenter 2 for CIRCLE");
       
        System.out.println("\nenter 3 for TRIANGLE");
        
        System.out.println("\nenter your shapes:");
       
        
        int shape=Integer.parseInt(cs.readLine());
        area2 ar=new area2();
        
       
        
        if(shape==1){
            int length=Integer.parseInt(cs.readLine());
            int breadth=Integer.parseInt(cs.readLine());
            ar.rectangle(length,breadth);
        }
        else if(shape==2){
            int radius=Integer.parseInt(cs.readLine());
             ar.circle(radius);
        }else if(shape==3){
            int breadth=Integer.parseInt(cs.readLine());
            int height=Integer.parseInt(cs.readLine());
            ar.triangle(breadth,height);
        }

    }
}
    

