import java.util.*;

public class BookRecord{
    
    Scanner sc = new Scanner(System.in);
    
    Book b1 = new Book("HeadFirstJava", 1, "KathySierra", "Oreilly");
    
    Book b2 = new Book("DiscreteMath", 2, "Rosen", "McGraw-Hill");
    
    Book b3 = new Book("ElementaryProbability", 3, "Durrett", "CambridgePress");
    
    Book BookArray [] = {b1, b2, b3, null, null};
    
    int length = BookArray.length;
    
    int size = 3;
    
    public void addRecord(String n, int i, String a, String p){
        
        Book b = new Book(n, i, a, p);
        
        if(size==length){
            resizeArray(size+3);
            BookArray[size] = b;
        }else{
            BookArray[size] = b;
        }
        
        size = size + 1;
        
        printRecord();
        
    }
    
    public void printRecord(){
        
        sort(size);
        
        for(int i=0; i<size; i++){
            System.out.println(BookArray[i]);
        }
    }
    
    public void deleteRecord(int i2){
        boolean b = false;
        
        for(int c=0; c<size; c++){
            Book temp = BookArray[c];
            int o = temp.getId();
            if(o==i2){
                BookArray[c] = null;
                shiftLeft(c);
                System.out.println("ID " + i2 + " is deleted");
                b = true;
            }
            
            if(b==false) System.out.println("ID " + i2 + "doesn't exist");
            
        }
        
        printRecord();
    }
    
    public void editRecord(){
        
        System.out.print("Enter the number of edits to perform");
        int numOfEdits = sc.nextInt();
        
        for(int i=0; i<numOfEdits; i++){
            
            System.out.print("Enter name to edit");
            Scanner name = new Scanner(System.in);
            String n = name.nextLine();
            
            System.out.print("Enter id to edit");
            Scanner id = new Scanner(System.in);
            int i3 = id.nextInt();
            
            System.out.print("Enter author to edit");
            Scanner author = new Scanner(System.in);
            String a = author.nextLine();
            
            System.out.print("Enter publisher to edit");
            Scanner publisher = new Scanner(System.in);
            String p = publisher.nextLine();
            
            boolean b = false;
            
            for(int c=0; c<size; c++){
                Book temp = BookArray[c];
                int o = temp.getId();
                if(o==i3){
                    BookArray[c].name = n;
                    BookArray[c].author = a;
                    BookArray[c].publisher = p;
                    
                    b = true;
                }
            }
            
            if(b==false) System.out.println("ID " + i + " doesn't exist");
            
        }
        
        printRecord();
    }
    
    
    public void shiftLeft(int delPos){
        int k = delPos;
        int ns = size - delPos + 1;
        
        for(int i=0; i<ns; i++){
            BookArray[k] = BookArray[k+1];
            k = k + 1;
        }
        
        BookArray[size] = null;
        size = size - 1;
    }
    
    public void resizeArray(int newCapacity){
        
        Book b [] = new Book[newCapacity];
        
        for(int i=0; i<size; i++){
            b[i] = BookArray[i];
        }
        
        BookArray = b;
    }
    
    public void sort(int size){
        // Have To Sort The Array
    }
    
}





