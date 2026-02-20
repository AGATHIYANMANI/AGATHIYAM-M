import java.util.*;

public class area {
    void rectangle(int length,int breadth){
        System.out.println("Area of rectangle:"+(length*breadth));
    }
    void circle(int radius){

        System.out.println("Area of circle:"+(3.14*radius*radius));
        
    }
    void triangle(int breadth,int height){
        System.out.println("Area of triangle:"+(breadth*height));
    }

    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter 1 for RECTANGLE");
        System.out.println("enter 2 for CIRCLE");
        System.out.println("enter 3 for TRIANGLE");
        System.out.println("enter your shapes:");
        int shape=sc.nextInt();
        area ar=new area();
        
       
        
        if(shape==1){
            int length=sc.nextInt();
            int breadth=sc.nextInt();
            ar.rectangle(length,breadth);
        }
        else if(shape==2){
            int radius=sc.nextInt();
             ar.circle(radius);
        }else if(shape==3){
            int breadth=sc.nextInt();
            int height=sc.nextInt();
            ar.triangle(breadth,height);
        }

    }
}
    

