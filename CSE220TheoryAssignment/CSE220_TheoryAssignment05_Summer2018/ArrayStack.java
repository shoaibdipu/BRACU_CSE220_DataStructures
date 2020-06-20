public class ArrayStack implements Stack{
    
    Object [] data;
    int size;
    
    public ArrayStack(){
        size = 0;
        data = new Object[100];
        
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }
    
    public void push(char o) throws StackOverFlowException{
        
        if(size==data.length) throw new StackOverFlowException();
        else if(size==0){
            data[0] = o;
            size++;
        }else{
            data[size] = o;
            size++;
        }
        
        
    }
    
    public Object pop() throws StackUnderFlowException{
        if(size==0) throw new StackUnderFlowException();
        else{
            Object temp = data[size-1];
            data[size-1] = null;
            size--;
            return temp;
        }
    }
    
    public Object peek() throws StackUnderFlowException{
        if(size==0) throw new StackUnderFlowException();
        else return data[size-1];
    }
    
}

