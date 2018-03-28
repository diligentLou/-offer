package offer14;

/**
 * Created by DELL on 2018/2/18.
 * Describe:输入一个链表，输出该链表中倒数第k个结点。
 * <p>
 * 思路：两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，到达第k个节点。
 * 然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode headNode = head;
        ListNode lastNode = head;
        if (head == null || k <= 0) {
            return null;
        }
        for (int i = 1; i < k; i++) {
            if (headNode.next != null) {
                headNode = headNode.next;
            } else {
                return null;
            }
        }
        while (headNode.next != null) {
            headNode = headNode.next;
            lastNode = lastNode.next;
        }
        return lastNode;
    }
}
