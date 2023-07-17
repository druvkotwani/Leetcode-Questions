// https://leetcode.com/problems/linked-list-random-node/description/

// Brute: O(n) time, O(n) space

class Solution {

    List<Integer> list = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp  = head;

        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        
    }
    
    public int getRandom() {
        int n = list.size();

        double randomIndex = Math.random()*n;

        return (int)(list.get((int)(randomIndex)));
    }
}

// Optimal: O(n) time, O(1) space

