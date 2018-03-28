package offer07;

/**
 * Created by DELL on 2018/2/15.
 * Describe:大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 * <p>
 * 思路：不能用递归，递归n越来越大后肯定会stackoverflow
 * 用动态规划 以一定的空间代价避免代价更大的重复计算的栈空间浪费
 */
public class Solution {
    public int Fibonacci(int n){
        if(n<=1){
            return n;
        }
        int[] record=new int[n+1];
        record[0]=0;
        record[1]=1;
        for (int i = 2; i <=n ; i++) {
            record[i]=record[i-1]+record[i-2];
        }
        return record[n];
    }
}
