import java.util.*;
public class charpresentinarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> result=new ArrayList<>();
        char x=sc.next().charAt(0);
        int n=sc.nextInt();
        String [] array=new String[n];
        sc.nextLine();
        for(int k=0;k<n;k++){
            array[k]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
        
            for(int j=0;j<array[i].length();j++){
                if(array[i].charAt(j)==x){
                    result.add(i);
                    break;

                }
            }
        }
System.out.println(result);
    }
}
