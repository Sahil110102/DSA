

class Node {

    int data;
    Node next;

    Node(int data1, int next1){
        this.data = data1;
        this.data = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }

    
};
public class TraversalLL {
    
    private static Node covertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 0; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    /*private static int LengthLL(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null) {

            temp = temp.next;
            count ++;
        }
        return count;
    }
    private static checkIfPresesnt(Node head ,int val){
        Node temp = head;
        while (temp != null) {
            if(temp.data == val){
                return 1;
                temp = temp.next;
            }
            return 0;
        }
    }*/

    private static Node removeHead (Node head){
        if(head == null){
            return head;
        }
        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        int [] arr = {2, 5, 8, 9};
        Node head = covertArr2LL (arr);
        System.out.println(head.data);
        // System.out.println(LengthLL(head));
        head = removeHead(head);
        System.out.println(head.data);

        

    }
}