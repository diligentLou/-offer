package offer44;

import java.util.ArrayList;

/**
 * Created by DELL on 2018/3/15.
 * 滑动窗口的最大值
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        int max = num[0];
        int flag = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (size==0) {
            return list;
        }
        if (num.length < size) {
            return list;
        }
        int end = num.length - size;
        if (num.length >= size) {
            for (int i = 0;i <= end; i++){
                flag = size + i;
                max = num[i];
                for (int a = i; a < flag; a++) {
                    if (max < num[a]) {
                        max = num[a];
                    }
                }
                list.add(max);
            }
        }
        return list;
    }

}
