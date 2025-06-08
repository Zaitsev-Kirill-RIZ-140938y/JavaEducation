package lr9.task_5;

public class createTail {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node tail = head;
        for (int i = 1; i < 4; i++) {
            Node newNode = new Node(i, null);
            tail.next = newNode;
            tail = newNode;
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}