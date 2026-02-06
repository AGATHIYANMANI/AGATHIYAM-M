import java.util.*;
class trafficsignals{
    String rules(String signal){
    if(signal.equals("red")){
        return"stop!";
    }
    else if(signal.equals("yellow")){
        return "get ready!";
    }
    else if(signal.equals("green")){
        return"go!";
    }
    else{
        return"valid traffic signals rules!";
    }
}
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String signal=sc.nextLine();
    trafficsignals tr=new trafficsignals();
    System.out.println(tr.rules(signal));
}
}
