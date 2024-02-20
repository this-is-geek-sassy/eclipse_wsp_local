package linkedList.middle_of_list;

import linkedList.node.ListNode;

// link to the problem: https://leetcode.com/problems/middle-of-the-linked-list/

public class Solution1 {

	public ListNode middleNode(ListNode head) {
        
		ListNode fast = head, slow = head;
		try {
		while (fast != null) {
			
				fast = fast.next;
				fast = fast.next;
				slow = slow.next;
		} 
		} catch (NullPointerException e) {
				System.out.println("fast pointer moved too fast\n " + e.getMessage());
//				break;
			} finally {
//				if (fast == null)
//					slow = slow.next;
			}
//			slow = slow.next;
		
//		slow = slow.next;
		
		return slow;
    }
}
