import java.util.*;
public class countrepetation{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String sentence=sc.nextLine();//school
    for(int i=0;i<sentence.length();i++){
        int count=0;
        for(int j=0;j<sentence.length();j++){
        if(sentence.charAt(i)==sentence.charAt(j)){
            count++;
        }
        
    }
    System.out.println(sentence.charAt(i) +"= "+count);
}
    }
}