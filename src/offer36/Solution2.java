package offer36;

import java.math.BigInteger;

/**
 * Created by DELL on 2018/3/15.
 */
public class Solution2 {
    public int Add(int num1,int num2) {
        BigInteger bi1 = new BigInteger(String.valueOf(num1));
        BigInteger bi2 = new BigInteger(String.valueOf(num2));
        return bi1.add(bi2).intValue();
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.Add(5,8));
    }
}
