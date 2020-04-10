package leetcode;

public class AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
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
                    listNode.next = newlistNode;
                    nextNode = newlistNode;
                }else {
                    listNode = newlistNode;
                }
            }

            return null;
        }

        private String getNumber(ListNode l1) {
            return l1.val + "" + getNumber(l1.next);
        }
    }

}