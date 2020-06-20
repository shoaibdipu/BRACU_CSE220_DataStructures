/* 
 * Doubly List
 * CSE220 LAB 05
 * SHOAIB AHMED DIPU
 * ID : 17 10 14 82
 */

public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int count = 0;
        for(Node x = head.next; x!=head; x=x.next){
            count++;
        }
        return count; 
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        for(Node x = head.next; x!=head; x=x.next){
            System.out.print(x.element + " ");
        }
        System.out.println();
    }
    
    public void backwardprint(){
        for(Node x=head.prev; x!=head; x=x.prev){
            System.out.print(x.element + " ");
        }
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        int count = countNode();
        if(idx<0 || idx>=count) return null;
        else{
            
            int i=0;
            
            for(Node x = head.next; x!=head; x=x.next){
                if(i!=idx) i++;
                else return x;
            }
        }
        
        return null; 
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int i = 0;
        for(Node x=head.next; x!=head; x=x.next){
            if(x.element.equals(elem)) return i;
            else i++;
        }
        return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        int count = countNode();
        
        if(idx<0 || idx>count){
        }else{
            Node t = new Node(elem, null, null);
            
            Node x = head;
            
            int i=0;
            while(i!=count){
                if(i==idx) break;
                else{
                    i++;
                    x=x.next;
                }
            }
            
            Node y = x.next;
            
            x.next = t;
            t.next = y;
            t.prev = x;
            y.prev = t;
        }
    }
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        int count = countNode();
        if(index<0 || index>=count){
            return null;
        }else{
            int i = 0;
            for(Node x = head.next; x!=head; x=x.next){
                if(index!=i) i++;
                else{
                    Node removedNode = x;
                    Node pred = x.prev;
                    Node succ = x.next;
                    
                    pred.next = succ;
                    succ.prev = pred;
                    
                    removedNode.prev = null;
                    removedNode.next = null;
                    
                    Node temp = removedNode;
                    removedNode = null;
                    
                    return temp.element;
                }
            }
        }
        return null;
    }
}