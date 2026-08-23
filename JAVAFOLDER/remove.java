import java.util.Scanner;
class remove{
    public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     String sentence=sc.nextLine();
     String removed=sentence.replace(" ","");
     System.out.println("Given Sentence: "+sentence);
     System.out.println("Removed Sentence: "+removed);
    }
}