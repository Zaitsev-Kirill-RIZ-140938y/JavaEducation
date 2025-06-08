package lr9.task_5;

public class createHead {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 0; i < 4; i++) {
            head = new Node(i, head);
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
