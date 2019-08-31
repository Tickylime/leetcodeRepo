/**给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/add-two-numbers
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
 public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){return null;}
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        int addOne = 0;
        while(l1 != null || l2 != null || addOne != 0){
            int val1 = l1 == null?0:l1.val;
            int val2 = l2 == null?0:l2.val;
            int sum = val1 + val2 + addOne;
            head.next = new ListNode(sum % 10);
            head = head.next;
            addOne = sum / 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }return temp.next;
    }
}

/**
 * Definition for singly-linked list.
 * public static class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
        this.val = val;
    }
 * }
 */
