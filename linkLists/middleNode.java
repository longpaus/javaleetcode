package linkLists;

public class middleNode {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        for (ListNode i = head; i != null; i = i.next) {
            len++;
        }
        int ansNode = len / 2 + 1;
        int i = 1;
        for (ListNode j = head; i <= ansNode; i++, j = j.next) {
            if (i == ansNode) {
                return j;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.print(5 / 2);
    }
}
