public class space {
    public static void main(String[] args){
        char a=' ';
        String name="A for Apple";
        int count=0;
        for(int i=0;i<=name.length()-1;i++){
            if(name.charAt(i)==a){
                count++;
            }

        }
        System.out.println(count);

    }
}
