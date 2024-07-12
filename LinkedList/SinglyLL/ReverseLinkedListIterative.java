public class ReverseLinkedListIterative {
    public static Node reverseLinkedList(Node head) {
    Node temp = head;  
   
   // Initialize pointer 'prev' to NULL,
   // representing the previous node
   Node prev = null;  
   
   // Traverse the list, continue till
   // 'temp' reaches the end (NULL)
   while(temp != null){  
       // Store the next node in
       // 'front' to preserve the reference
       Node front = temp.next;  
       
       // Reverse the direction of the
       // current node's 'next' pointer
       // to point to 'prev'
       temp.next = prev;  
       
        // Move 'prev' to the current
        // node for the next iteration
       prev = temp;  
       
        // Move 'temp' to the 'front' node
        // advancing the traversal
       temp = front; 
   }
   // Return the new head of
   // the reversed linked list
   return prev;  

    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with values 1, 3, 2, and 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseLinkedList(head);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
