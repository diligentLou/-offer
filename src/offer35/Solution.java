package offer35;

/**
 * Created by DELL on 2018/3/15.
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * 思路:求和的公式为n(n+1)/2,右移一位相当于除2
 */
public class Solution {
    public int Sum_Solution(int n) {
        int sum = (int) (Math.pow(n,2)+n);
        return sum >> 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.Sum_Solution(10));
    }
}
