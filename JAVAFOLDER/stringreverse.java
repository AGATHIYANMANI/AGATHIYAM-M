import java.util.Scanner;

public class stringreverse {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println(sb.reverse());
        
    }
  
}
