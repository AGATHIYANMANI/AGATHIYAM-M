public class automorphic{
    void find(int num){
        int n=num;
        int a=num*num;
        int result =0;
        while(a>99){
         int b=a%10;
         a/=10;
         result=result*10+b;
        }
        if(result==num){
            System.out.println("AUTOMORPHIC NUMBER");
        }
        else{
            System.out.println("NOT AUTOMORPHIC NUMBER");
        }
    }
    public static void main(String [] args){
        int num=76;
        automorphic nn=new automorphic();
        nn.find(num);
    }
}