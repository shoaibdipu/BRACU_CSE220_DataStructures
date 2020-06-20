// 3. Sort a singly linked sequential list using bubble sort algorithm.

public class lab08task03{
    public static void main(String[]args){
        
        int [] a = {50, 10, 20, 40, 30};
        
        Node head = new Node(a[0], null);
        Node tail = head;
        
        for(int i=1; i<a.length; i++){
            Node temp = new Node(a[i], null);
            tail.next = temp;
            tail = tail.next;
        }
        
        
        for(Node i=head; i.next!=null; i=i.next){
            for(Node j=i; j.next!=null; j=j.next){
                if(j.elem>j.next.elem){
                    int temp = j.elem;
                    j.elem = j.next.elem;
                    j.next.elem = temp;
                }
            }
        }
        
        printList(head);
    }
    
    
    
//        for(int i=0; i<a.length-1; i++){
//            for(int j=0; j<a.length-1-i; j++){
//                if(a[j]>a[j+1]){
//                    int temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
    
    
    public static void printList(Node head){
        for(Node x = head; x!=null; x=x.next){
            System.out.print(x.elem + " ");
        }
    }
}

