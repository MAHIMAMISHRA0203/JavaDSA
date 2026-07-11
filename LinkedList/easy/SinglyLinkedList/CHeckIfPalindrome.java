package LinkedList.easy.SinglyLinkedList;

public class CHeckIfPalindrome {
    public boolean check(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Skip middle node for odd length
        if (fast != null)
            slow = slow.next;

        // Reverse second half
        Node prev = null;

        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }


        Node first = head;
        Node second = prev;

        while (second != null) {
            if (first.data != second.data)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
    }
}
