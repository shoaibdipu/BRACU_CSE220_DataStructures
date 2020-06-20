public class MyOrderList{
    public Node head;
    public Node cursor;
    Node t;
    
    public MyOrderList(){
        head=new Node(0, null);
    }
    
    public MyOrderList(int[] a){
        
        head=new Node(a[0], null);
        Node h=head;
        
        for(int i=1; i<a.length; i++){
            Node tail=new Node(a[i], null);
            h.next=tail;
            h=tail;
        }
        
        for(Node i=head; i!=null; i=i.next){
            if(i.next==null){
                break;
            }
            else{
                for(Node j=i.next; j!=null; j=j.next){
                    if(i.element>j.element){
                        int temp=i.element;
                        i.element=j.element;
                        j.element=temp;
                    }
                }
            }
        }
        h.next=head;
        cursor=h;
    }
    
    public void printList(){
        System.out.print(head.element+" ");
        for(Node i=head.next; i!=head; i=i.next){
            System.out.print(i.element+" ");
        }
        System.out.println();
        System.out.println("cursor: "+cursor.element);
    }
    
    public void insert(Node n){
        boolean b=false;
        
        //Node t=new Node(0,null);
        
        if(head.element>n.element){
            cursor=head;
            n.next=head;
            for(Node i=head.next; i!=null; i=i.next){
                t=i;
            }
            t.next=n;
            head=n;
        }else{
            
            for(Node i=head; i.next!=head; i=i.next){
                
                Node m=i.next;
                
                if(m.element==n.element){
                    System.out.println("Key already exists");
                    b=true;
                    break;
                }else if((i.element<n.element)&&(m.element>n.element)){
                    n.next=m;
                    i.next=n;
                    cursor=m;
                    b=true;
                }
                t=i;
            }
            
            if(b==false){
                t.next=n;
                n.next=head;
                cursor=t;
            }
        }
    }
    
    public Node retrieve(int s){
        
        if(head.element==s){
            cursor=head;
            return head;
        }else{
            for(Node i=head.next; i!=head; i=i.next){
                if(i.element==s){
                    cursor=i;
                    return i;
                }
            }
        }
        
        System.out.println("not found!!");
        return null;
    }
    
    public Node remove(){
        
        if(cursor==head){
            
            for(Node i=head.next; i!=head; i=i.next){
                t=i;
            }
            
            t.next=head.next;
            head=head.next;
            cursor=head;
            
        }else{
            
            for(Node i=head; i.next!=head; i=i.next){
                if(i.next==cursor){
                    i.next=cursor.next;
                    cursor=i.next;
                }
            }
        }
        return cursor;
    }
    
    public Node remove(int n){
        
        Node r=new Node(0, null);
        
        for(Node  i=head; i.next!=head; i=i.next){
            
            if((i.next).element==n){
                r=i.next;
                cursor=(i.next).next;
                i.next=cursor;
            }
            
        }
        return r;
    }
    
    public void clear(){
        
        head.next=head;
        head.element=0;
        cursor=head;
        
    }
    
    public boolean isEmpty(){
        
        if((head.next==head)&&(head.element==0)){
            return true;
        }
        
        return false;
    }
    
    public Node gotoBegining(){
        
        if((head.next==head)&&(head.element==0)){
            return null;
        }else{
            cursor=head;
        }
        
        return cursor;
    }
    
    public Node gotoEnd(){
        
        if((head.next==head)&&(head.element==0)){
            return null;
        }else{
            for(Node i=head.next; i!=head; i=i.next){
                cursor=i;
            }
        }
        
        return cursor;
    }
    public Node gotoNext(){
        if((head.next==head)&&(head.element==0)){
            return null;
        }
        else{
            cursor=cursor.next;
        }
        return cursor;
    }
    
    public Node gotoPrior(){
        
        Node n=cursor;
        
        for(Node i=cursor.next; i!=n; i=i.next){
            cursor=i;
        }
        
        return cursor;
    }
    
    public Node getCursor(){
        
        if((head.next==head)&&(head.element==0)){
            return null;
        }
        
        return cursor;
    }
    public void showList(){
        
        if((head.next==head)&&(head.element==0)){
            System.out.println("Empty List");
        }else{
            System.out.print(head.element+" ");
            for(Node i=head.next; i!=head; i=i.next){
                System.out.print(i.element+" ");
            }
        }
    }
}
