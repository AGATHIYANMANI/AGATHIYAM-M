import java.io.*;

public class leave3 {
    Console cs=System.console();
    PrintWriter pw=new PrintWriter(System.out);
       String s=cs.readLine();
      
       if(s=="saturday"|| s=="sunday"){
           pw.write("yes");
           pw.flush();
           
       }
       
       else{
           pw.write("no");
           pw.flush();
       }
    }
}
