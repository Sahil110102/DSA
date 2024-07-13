import org.w3c.dom.Node;

/**
 * DetectLoop
 */
public class DetectLoop {


    // Brute Force Approach - Using Hashing
    // public static boolean detectLoop(Node head) {
    //     // Initialize a pointer 'temp'
    //     // at the head of the linked list
    //     Node temp = head;
        
    //     // Create a map to keep track
    //     // of encountered nodes
    //     Map<Node, Integer> nodeMap = new HashMap<>();

    //     // Step 2: Traverse the linked list
    //     while (temp != null) {
    //         // If the node is already in
    //         // the map, there is a loop
    //         if (nodeMap.containsKey(temp)) {
    //             return true;
    //         }
    //         // Store the current node in the map
    //         nodeMap.put(temp, 1);
    //         // Move to the next node
    //         temp = temp.next;
    //     }

    //     // Step 3: If the list is successfully
    //     // traversed without a loop, return false
    //     return false;
    // }


    // optimal Approach - Using Hare and Tortise Alogo
    public static boolean detectCycle(Node head) {
        // Initialize two pointers, slow and fast,
        // to the head of the linked list
        Node slow = head;
        Node fast = head;

        // Step 2: Traverse the linked list
        // with the slow and fast pointers
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            // Move fast two steps
            fast = fast.next.next;

            // Check if slow and fast pointers meet
            if (slow == fast) {
                return true;  // Loop detected
            }
        }

        // If fast reaches the end of the
        // list, there is no loop
        return false;
    }


    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

        // No need to explicitly free memory
        // in Java; the garbage collector handles it
    }
}