public class ListStack implements Stack{
    
    Node top;
    int size;
    
    public ListStack(){
        
        top = null;
        size = 0;
        
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }
    
    public void push(char o) throws StackOverFlowException{
        
        Node temp = new Node(o, null);
        temp.next = top;
        top = temp;
        size++;
        
    }
    
    public Object pop() throws StackUnderFlowException{
        if(size==0) throw new StackUnderFlowException();
        else{
            Node temp = top;
            Object o = temp.ch;
            
            top = top.next;
            
            temp.next = null;
            temp = null;
            
            size--;
            
            return o;
            
        }
        
        
    }
    
    public Object peek() throws StackUnderFlowException{
        if(size==0) throw new StackUnderFlowException();
        else{
            return top.ch;
        }
        
    }
    
}

