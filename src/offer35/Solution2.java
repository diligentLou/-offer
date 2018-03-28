package offer35;

/**
 * Created by DELL on 2018/3/15.
 * 思路二:1.利用逻辑与的短路特性实现递归终止
 *       2.当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)只执行前面的判断，为false，然后直接返回0;
 *       3.当n>0时，执行sum+=Sum_Solution(n-1)，实现递归计算Sum_Solution(n)
 */
public class Solution2 {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0) && ((sum+=Sum_Solution(n-1))>0);
        return sum;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.Sum_Solution(56));
    }
}
