// 4. Sort a singly linked sequential list using selection sort algorithm

public class lab08task04{
    public static void main(String[]args){
        
        int [] a = {50, 10, 20, 40, 30};
        
        Node head = new Node(a[0], null);
        Node tail = head;
        
        for(int i=1; i<a.length; i++){
            Node temp = new Node(a[i], null);
            tail.next = temp;
            tail = tail.next;
        }
        
        
        for(Node x = head; x.next!=null; x=x.next){
            int smallestValue = x.elem;
            Node smallestNode = x;
            
            for(Node j = x.next; j!=null; j=j.next){
                if(j.elem<smallestValue){
                    smallestValue = j.elem;
                    smallestNode = j;
                }
            }
            
            int temp = x.elem;
            x.elem = smallestValue;
            smallestNode.elem = temp;
        }
        
        printList(head);
    }
    
    public static void printList(Node head){
        for(Node x = head; x!=null; x=x.next){
            System.out.print(x.elem + " ");
        }
    }
}

