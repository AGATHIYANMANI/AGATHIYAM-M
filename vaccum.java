public class vaccum {
    void simple(int step){
        if(step==1){
            System.out.println("will clean");
        }
        else {
            System.out.println("already clean");
        }
    }
    public static void main (String [] args){
        int step=1;
        vaccum vc=new vaccum();
        vc.simple(step);
    }
}
