
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class input2{
    public static void main (String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String name=bf.readLine();
        System.out.println("SENTENCE:"+name);
    }
}