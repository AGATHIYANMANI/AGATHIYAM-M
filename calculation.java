public class calculation{
    String name;
    int age;
    String department;
    calculation(String name,int age,String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }
    void display(){
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("DEPARTMENT:"+department);
    }
    public static void main(String [] args){
        calculation cc1=new calculation("GURUSARAN",18,"CSE");
         calculation cc2=new calculation("AGATHIYAN",19,"CSE");
           cc1.display();
           cc2.display();
           
        
    }
}