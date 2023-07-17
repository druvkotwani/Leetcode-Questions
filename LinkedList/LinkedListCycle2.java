// https://leetcode.com/problems/linked-list-cycle-ii/description/

// Brute: O(n) time, O(n) space

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode temp = head;
        Set<ListNode> set = new HashSet<>();

        while(temp!=null){
            if(set.isEmpty() || !set.contains(temp)) set.add(temp);
            else if(set.contains(temp)) return temp;
            temp = temp.next;
        }
        return null;
        
    }
}

// Optimized: O(n) time, O(1) space

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                slow = head;
                while(slow!=fast){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}