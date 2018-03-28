package offer08;

/**
 * Created by DELL on 2018/2/17.
 * Describe:一只青蛙一次可以跳上一级台阶,也可以跳上2级。求该青蛙跳上一个n级台阶总共有多少种跳法
 *
 * 思路：就是斐波那契数列
 * 当前台阶的跳法总数=当前台阶后退一阶的台阶的跳法总数+当前台阶后退二阶的台阶的跳法总数
 */
public class Solution {
        /**
        //用数组
        public int JumpFloor(int target){
        if(target<1）{
            return target;
        }
        int []arr=new int[target+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= target; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[target];
         */
        public int JumpFloor(int target){
            int step1=1;
            int step2=2;
            int step3=0;
            for (int i = 3; i <=target ; i++) {
                step3=step1+step2;
                step1=step2;
                step2=step3;
            }
            return step3;
    }
}
