/* 
 * Linked List
 * CSE220 LAB 04
 * SHOAIB AHMED DIPU
 * ID : 17 10 14 82
 */

public class LinkedList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public LinkedList(Object [] a){
        head=new Node(a[0],null);
        Node tail=head;
        for(int i=1;i<a.length;i++){
            Node x=new Node(a[i],null);
            tail.next=x;
            tail=x;//tail=tail.next;
        }
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int count = 0;
        for(Node x = head; x!=null; x=x.next){
            count++;
        }
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void printList(){
        for(Node x = head; x!=null; x=x.next){
            System.out.print(x.element + " ");
        }
        System.out.println();
    }
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        if(idx<0) return null;
        else{
            int i=0;
            for(Node x = head; x!=null; x=x.next){
                if(i!=idx) i++;
                else return x;
            }
            return null;
        }
    }
    
// returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx){
        if(idx<0) return null;
        else{
            int i=0;
            for(Node x = head; x!=null; x=x.next){
                if(i!=idx) i++;
                else return x.element;
            }
            return null;
        }
    }
    
    
    
    /* updates the element of the Node at the given index. 
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public Object set(int idx, Object elem){
        if(idx<0) return null;
        else{
            int i=0;
            for(Node x = head; x!=null; x=x.next){
                if(i!=idx) i++;
                else{
                    Object temp = x.element;
                    x.element = elem;
                    return temp;
                }
            }
        }
        return null;
    }
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int i = 0;
        for(Node x=head; x!=null; x=x.next){
            if(x.element==elem) return i;
            i++;
        }
        return -1;
    }
    
    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem){
        for(Node x = head; x!=null; x=x.next){
            if(x.element==elem) return true;
        }
        return false; 
    }
    
    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList(){
        Node copyHead = null;
        Node copyTail = null;
        
        for(Node x = head; x!=null; x=x.next){
            Node newNode = new Node(x.element, null);
            if(copyHead == null){
                copyHead = newNode;
                copyTail = copyHead;
            }else{
                copyTail.next = newNode;
                copyTail = copyTail.next;
            }
        }
        return copyHead;
        
    }
    
    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList(){
        Node newHead = null;
        Node x = head;
        
        while(x!=null){
            Node nextNode = x.next;
            x.next = newHead;
            newHead = x;
            x = nextNode;
        }
        return newHead;
    }
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        int count = countNode();
        
        Node newNode = new Node(elem, null);
        
        if(idx<0 || idx >= count){
            
        }else if(idx==0){
            newNode.next = head;
            head = newNode;
        }else if(idx>0 && idx<count){
            Node pred = nodeAt(idx-1);
            newNode.next = pred.next;
            pred.next = newNode;
        }
    }
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        
        int count = countNode();
        
        Node removedNode = null;
        
        if(index < 0 || index>= count){
            return null;
        }else if(index==0){
            removedNode = head;
            head = head.next;
        }else if (index > 0 || index < count){
            Node pred = nodeAt(index-1);
            removedNode = pred.next;
            pred.next = removedNode.next;
        }
        return removedNode.element;
    }
    
    // Rotates the list to the left by 1 position.
    public void rotateLeft(){
        
        Node oldHead = head;
        head = head.next;
        
        Node tail = head;
        
        while(tail.next!=null){
            tail = tail.next;
        }
        
        tail.next = oldHead;
        oldHead.next = null;
        
    }
    
    // Rotates the list to the right by 1 position.
    public void rotateRight(){
        
        int count = countNode();
        Node oldHead = head;
        
        Node newHead = nodeAt(count-1);
        Node newTail = nodeAt(count-2);
        
        newTail.next = null;
        newHead.next = oldHead;
        
        head = newHead;
        
    }
}