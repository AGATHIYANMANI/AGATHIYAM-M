import java.io.*;

public class area3 {
    void rectangle(int length,int breadth) throws IOException{
        int a=length*breadth;
        System.out.printf("Area of rectangle:%d",a);
    }
    void circle(int radius) throws IOException{
        double b=3.14*radius*radius;
         System.out.printf("Area of circle:%f",b);
    }
    void triangle(int breadth,int height) throws IOException{
        int c=breadth*height;
         System.out.printf("Area of triangle:%d",c);
    }
    
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
        
        System.out.printf("\nenter 1 for RECTANGLE");
        
        System.out.printf("\nenter 2 for CIRCLE");
       
        System.out.printf("\nenter 3 for TRIANGLE");
        
        System.out.printf("\nenter your shapes:");
       
        
        int shape=Integer.parseInt(cs.readLine());
        area3 ar=new area3();
        
       
        
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
    

