package offer20;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by DELL on 2018/3/12.
 */
public class Solution2{
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for (int i = 0; i < input.length ; i++) {
            priorityQueue.add(input[i]);
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        if( k <= input.length) {
            for (int i = 0; i < k; i++) {
                arrayList.add(priorityQueue.poll());
            }
        }
        return arrayList;
    }
}
