class Solution {
    static void linkdelete(Node head, int n, int m) {
        Node temp = head, t; // Initializing pointers
        int count = 0;       // Initializing count variable
        while (temp != null) // Loop until end of linked list
        {
            for (count = 1; count < m && temp != null; count++) // Traverse m nodes
                temp = temp.next; // Move temp pointer to next node

            if (temp == null) // If temp becomes null, return
                return;
            t = temp.next; // Store next node after m nodes
            for (count = 1; count <= n && t != null; count++) // Traverse n nodes
            {

                t = t.next; // Move t pointer to next node
            }
            temp.next = t; // Connect current node to next n nodes
            temp = t;      // Move temp to next node after n nodes
        }
    }
}