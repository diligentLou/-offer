package offer32;

/**
 * Created by DELL on 2018/3/15.
 */
public class Solution2 {
    public String ReverseSentence(String str) {
        if (str == null) {
            return null;
        }
        if (str.trim().equals("")) {
            return str;
        }
        String string = str;
        String[] strings = string.split("");
        StringBuilder sBuilder = new StringBuilder();
        for (int i = strings.length-1; i>=0; i--) {
            if (i == 0) {
                sBuilder.append(strings[i]);
            } else {
                sBuilder.append(strings[i]);
                sBuilder.append("");
            }
            
        }
        String string2 = sBuilder.toString();
        return string2;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.ReverseSentence("student. a am I"));
    }
}