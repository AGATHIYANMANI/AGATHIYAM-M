import java.util.*;
class Solution5 {
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.next();
        Solution5 obj = new Solution5();
        int result = obj.firstUniqChar(s);
        System.out.println(result);
    }
}
