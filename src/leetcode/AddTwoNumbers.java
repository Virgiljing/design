package leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode = solution.addTwoNumbers(listNode1, listNode2);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            String s1= getNumber(l1);
            String s2= getNumber(l2);
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            int i3 = i1+i2;
            String s3 = i3 + "";
            ListNode listNode = null;
            ListNode nextNode = null;
            for (byte aByte : s3.getBytes()) {
                ListNode newlistNode = new ListNode(aByte);
                if (listNode != null) {
                    nextNode.next = newlistNode;
                    nextNode = newlistNode;
                }else {
                    listNode = newlistNode;
                    nextNode = listNode;
                }
            }

            return listNode;
        }

        private String getNumber(ListNode l1) {
            return l1.val + "" + getNumber(l1.next);
        }
    }

}