import java.util.*;

public class TesterClass{
    public static void main(String [] args){
        
        BookRecord br = new BookRecord();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Choice: "+"\n"+
                           "Enter 1 to Add a Record"+"\n"+
                           "Enter 2 to Print the Records"+"\n"+
                           "Enter 3 to Delete a Record"+"\n"+
                           "Enter 4 to Edit a Record");
        int choice = sc.nextInt();
        
        if(choice==1){
            System.out.print("Enter Name, Id, Author & Publisher: ");
            
            Scanner sc2 = new Scanner(System.in);
            String name = sc2.nextLine();
            
            int id = sc.nextInt();
            
            Scanner sc3 = new Scanner(System.in);
            String author = sc3.nextLine();
            
            Scanner sc4 = new Scanner(System.in);
            String publisher = sc4.nextLine();
            
            br.addRecord(name, id, author, publisher);
        }else if(choice==2){
            
            br.printRecord();
            
        }else if(choice==3){
            
            System.out.print("Enter an id to remove record: ");
            int id = sc.nextInt();
            
            br.deleteRecord(id);
            
        }else{
            
            br.editRecord();
            
        }
    }
}


