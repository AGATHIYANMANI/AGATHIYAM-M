public class vaccum3 {
     void simple(int step){
        if(step==1){
            System.out.printf("will clean");
        }
        else {
            System.out.printf("already clean");
        }
    }
    public static void main (String [] args){
        int step=1;
        vaccum vc=new vaccum();
        vc.simple(step);
    }
}
