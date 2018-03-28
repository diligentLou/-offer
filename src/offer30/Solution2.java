package offer30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by DELL on 2018/3/14.
 */
public class Solution2 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] ==sum) {
                    list.add(array[i]);
                    list.add(array[j]);
                    list.add(array[i] * array[j]);
                }
            }
            if (!list.isEmpty()) {
                lists.add(list);
            }
            if (lists.size() == 0) {
                return new ArrayList<Integer>();
            }
            Collections.sort(lists, new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    return o1.get(2).compareTo(o2.get(2));
                }
            });

        }
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = lists.get(0);
        for (int j = 0; j <temp.size() - 1; j++) {
            result.add(temp.get(j));
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2 solution=new Solution2();
        int[] a= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14} ;
        ArrayList arrayList=solution.FindNumbersWithSum(a,13);
        System.out.println(arrayList);
    }
}
