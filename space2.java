import java.io.*;

public class space2{
    public static void main(String[] args) throws IOException{
        Console cs=System.console();
        char a=' ';
        System.out.println("Enter sentence:");
        
        String name=cs.readLine();
        int count=0;
        for(int i=0;i<=name.length()-1;i++){
            if(name.charAt(i)==a){
                count++;
            }

        }System.out.println("Sentence:"+count);
        

    }
}
