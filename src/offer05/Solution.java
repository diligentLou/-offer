package offer05;

import java.util.Stack;

/**
 * Created by DELL on 2018/2/14.
 *  Describe:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * 思路：先判断stack2中是否为空。如果空，先把stack1中的数全都pop并push到stack2中再pop出栈。
 * 如果不为空，stack2直接出栈
 */
public class Solution {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(int node){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                //取出stack1中顶部的数并压入stack2中,直到stack1中没有数
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else {
            return stack2.pop();
        }
    }
}
