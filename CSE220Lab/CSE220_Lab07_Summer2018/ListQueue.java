/* 
 * List Queue Implementation
 */

public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){ 
        if(size==0) return true; 
        else return false; 
    }
    
    public void enqueue(Object o) throws QueueOverflowException{
        Node temp = new Node(o, null);
        
        if(size==0){
            front = temp;
            rear = front;
        }else{
            rear.next = temp;
            rear = temp;
        }
        
        size++;
    }
    
    public Object dequeue() throws QueueUnderflowException{
        
        if(size==0) throw new QueueUnderflowException();
        else{
            
            Object temp = front.val;
            front = front.next;
            size--;
            
            return temp;
        }
    }
    
    public Object peek() throws QueueUnderflowException{
        
        if(size==0) throw new QueueUnderflowException();
        else{
            return front.val;
        }
    }
    
    public String toString(){
        if(size==0) return "Empty Queue";
        else{
            String s = "[";
            
            for(Node x = front; x!=null; x=x.next){
                s = s + " " + x.val;
            }
            
            s = s + " ]";
            
            return s;
        }
    }
    
    public Object[] toArray(){
        
        Object tempA [] = new Object[size];
        
        int j = 0;
        
        for(Node x = front; x!=null; x=x.next){
            tempA[j] = x.val;
            j++;
        }
        
        return tempA;
    }
    
    public int search(Object o){
        
        int count = 0;
        
        for(Node x = front; x!=null; x=x.next){
            if(o==x.val) return count;
            else count++;
        }
        
        return -1;
    }
}

