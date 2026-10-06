import java.util.Scanner;
class maxwordsinarray {
    public int mostWordsFound(String[] sentences) {
        int max=0;
       for(int i=0;i<sentences.length;i++){
        int count=0;
        for(int j=0;j<sentences[i].length();j++){
            if(sentences[i].charAt(j)==' '){
                count++;
            }
        }
        if(count>max){
            max=count;
        }
       }
       return max+1;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] sentences=new String[n];
        for(int i=0;i<n;i++){
            sentences[i]=sc.nextLine();
        }
        maxwordsinarray ma=new maxwordsinarray();
        System.out.println("Result:"+ma.mostWordsFound(sentences));
    }
}