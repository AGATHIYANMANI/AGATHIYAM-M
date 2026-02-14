class parameter{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }
    public static void main (String [] args){
        parameter pr=new parameter();
        pr.add(23,90);
        pr.sub(23,90);
        pr.mul(23,78);
        pr.div(88,44);


    }}