public class obj {
    String name;
    int age;
    int marks;
    obj(String n,int a,int m){
name=n;
age=a;
marks=m;}

void dis(){
    System.out.println("NAME:"+ name +"AGE:"+ age +"MARKS:"+ marks);
}

public static void main(String [] args){
    obj oo=new obj("AGATHIYAN",19,500);
    obj oo1=new obj("KUMAR",19,509);
    oo.dis();
     oo1.dis();

}
    }

