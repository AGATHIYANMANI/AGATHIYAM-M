import java.util.Scanner;
public class inputcheck {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String sentence=sc.next();
      boolean target=true;
      for(int i=0;i<sentence.length();i++){
          char character=sentence.charAt(i);
          if(character <'0' || character >'9'){
              target=false;
              break;
          }
      }
      if(target){
          System.out.println("yes");
      }
      else{
          System.out.println("no");
      }
    }
}