// 5. Sort a DOUBLY linked sequential list using insertion sort algorithm.

public class lab08task05{
    
    public static void main(String[]args){
        
        int [] a = {50, 10, 20, 40, 30};
        
        Node head = new Node(a[0], null, null);
        Node tail = head;
        
        for(int i=1; i<a.length; i++){
            Node temp = new Node(a[i], null, null);
            tail.next = temp;
            temp.prev=tail;
            tail=tail.next;
        }
        
        Node prevHead = head.prev;
        
        for(Node x=head.next; x!=null; x=x.next){
            
            Node key = x;
            Node j = x.prev;
            
            while(j!=prevHead && j.elem>key.elem){
                int temp = x.elem;
                key.elem = j.elem;
                j.elem = temp;
                x=j;
                j=j.prev;
            }
            
        }
        
        printArray(head);
    }
    
    public static void printArray(Node head){
        for(Node x=head; x!=null; x=x.next){
            System.out.print(x.elem + " ");
        }
        
    }
}