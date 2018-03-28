package offer29;

import java.util.ArrayList;

/**
 * Created by DELL on 2018/3/14.
 */
public class Solution2 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();
        if (sum < 2) {
            return aList;
        }
        for (int i = 1; i <= sum/2 ; i++) {
            ArrayList<Integer> aList2 = new ArrayList<Integer>();
            int count = 0;
            for (int j = i; j < sum; j++) {
                count += j;
                aList2.add(j);
                if (count > sum){
                    break;
                }else if (count == sum) {
                    aList.add(aList2);
                    break;
                }
            }
        }
        return aList;
    }
    public static void main(String[] args) {
        Solution2 solution=new Solution2();
        System.out.println(solution.FindContinuousSequence(543));
    }
}

