public class Node{ 
    
    Node next; 
    Node prev;
    int elem; 
    
    public Node(int elem, Node next, Node prev){ 
        this.elem = elem; 
        this.next = next; 
        this.prev = prev;
    } 
}