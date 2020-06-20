public class Tester{
    public static void main(String[]args){
        
        int[] a1= {10, 1, 4, 7, 3, 2};
        int[] a2= {11, 2, 5, 6, 12, 4};
        
        MyOrderList list1= new MyOrderList(a1);
        MyOrderList list2= new MyOrderList(a2);
        
        list1.printList();
        
        Node n=new Node(5,null);
        list1.insert(n);
        list1.printList();
        
        System.out.println(list1.retrieve(6));
        System.out.println(list1.remove());
        list1.printList();
        
        System.out.println(list1.remove(2));
        list1.printList();
        
        list1.clear();
        list1.printList();
        
        System.out.println(list1.isEmpty());
        list2.gotoBegining();
        list2.printList();
        list2.gotoEnd();
        list2.printList();
        
        list2.gotoNext();
        list2.printList();
        list2.gotoPrior();
        list2.printList();
        
        System.out.println((list2.getCursor()).element);
        list2.showList();
    }
}
