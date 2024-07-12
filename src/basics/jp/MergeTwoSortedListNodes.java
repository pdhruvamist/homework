package basics.jp;

public class MergeTwoSortedListNodes {

    public static void main(String[] args) {

        MergeTwoSortedListNodes mainClass = new MergeTwoSortedListNodes();
        ListNode result = mainClass.mergeTwoListNode();
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }

    }

    // first = [1, 2, 4] & second = [1, 3, 4]
    private ListNode mergeTwoListNode() {
        //   private ListNode mergeTwoListNode(ListNode first, ListNode second) {
        ListNode first4 = new ListNode(4, null);
        ListNode first2 = new ListNode(2, first4);
        ListNode first = new ListNode(1, first2);

        ListNode second4 = new ListNode(4, null);
        ListNode second3 = new ListNode(3, second4);
        ListNode second = new ListNode(1, second3);

        ListNode result = new ListNode(0);
        ListNode current = result;

        while (first != null && second !=null) {
            if(first.val <= second.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }

        if (first != null) {
            current.next = first;
        }

        if (second != null) {
            current.next = second;
        }

        return result.next;
    }




    class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
