public class strontio{
    int num;
    strontio(int n){
        num=n;
    }
    void cal(){
        if(num>999&&num<10000){
        int last=num%1000;
        int first=last/10;
        int finlast=first%10;
        int finfirst=first/10;
        if(finlast==finfirst){
            System.out.println(num+"The number is strontio");
        }
        else{
            System.out.println(num+"the number is not strontio");
        }
    }
    else{
        System.out.println("The number should be 4 digit");
    }
    }
    public static void main(String [] args){
        strontio st=new strontio(1223);
        strontio st1=new strontio(1345);
        st.cal();
        st1.cal();
    }

}
//n=1234..totl=1234%1000..234
//next=total(234)/10..23
//fin=next(23)..%10..3
//lfinal=next(23)/10 ..2