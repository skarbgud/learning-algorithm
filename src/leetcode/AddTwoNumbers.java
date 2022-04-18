package leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers T = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode l1_1 = new ListNode(4, l1);
        ListNode l1_2 = new ListNode(3, l1_1);

        ListNode l2 = new ListNode(5);
        ListNode l2_1 = new ListNode(6, l2);
        ListNode l2_2 = new ListNode(4, l2_1);

        T.addTwoNumbers(l1_2, l2_2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode node = answer;

        int sum = 0;

        while (l1 != null || l2 != null || sum > 0) {

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            node.next = new ListNode(sum % 10);
            sum /= 10;
            node = node.next;
        }

        return answer.next;
    }
}


























