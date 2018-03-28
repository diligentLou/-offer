package offer03;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by DELL on 2018/2/13.
 * Describe:输入一个链表，从尾到头打印链表每个节点的值。
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack=new Stack<Integer>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
