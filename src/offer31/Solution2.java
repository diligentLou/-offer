package offer31;

/**
 * Created by DELL on 2018/3/14.
 */
public class Solution2 {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if (len == 0) {
            return "";
        }
        n = n % len;
        str += str;
        return str.substring(n,len+n);
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.LeftRotateString("tiancailouchenyang",7));
    }
}
