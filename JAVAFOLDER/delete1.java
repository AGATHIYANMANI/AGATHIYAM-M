import java.util.Scanner;
public class delete1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        StringBuilder sb=new StringBuilder(sentence);
        sb.delete(2,3);
        System.out.println(sb);
    }
}
