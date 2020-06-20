/* 
 * Array Queue Implementation
 * SHOAIB AHMED DIPU
 * ID : 17 10 14 82
 */

public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){ 
        if(size==0) return true; 
        else return false; 
    }
    
    public void enqueue(Object o) throws QueueOverflowException{
        if(size>=data.length) throw new QueueOverflowException();
        else{
            
            int pos = (front + size + 1)%data.length;
            data[pos] = o;
            size++;
            
        }
    }
    
    
    public Object dequeue() throws QueueUnderflowException{
        if(size==0) throw new QueueUnderflowException();
        else{
            
            int pos = (front+1)%data.length;
            Object o = data[pos];
            front++;
            size--;
            
            return o;
            
        }
    }
    
    public Object peek() throws QueueUnderflowException{
        if(size==0) throw new QueueUnderflowException();
        else{
            
            return data[(front+1)%data.length];
        }
        
    }
    
    public String toString(){
        if(size==0) return "Empty Queue";
        else{
            String s = "[";
            
            int pos = (front+1)%data.length;
            
            for(int i=0; i<size; i++){
                s = s + " " + data[pos];
                pos = (pos+1)%data.length;
            }
            
            s = s + " ]";
            
            return s;
        }
    }
    
    public Object[] toArray(){
        int pos = (front+1)%data.length;
        
        Object tempA [] = new Object[size];
        
        for(int i=0; i<tempA.length; i++){
            tempA[i] = data[pos];
            pos = (pos+1)%data.length;
        }
        
        return tempA;
    }
    
    public int search(Object o){
        
        int pos = (front+1)%data.length;
        
        int count = 0;
        
        for(int i=0; i<size; i++){
            if(data[pos]==o) return count;
            else count++;
            
            pos = (pos+1)%data.length;
        }
        
        return -1;
    }
    
}