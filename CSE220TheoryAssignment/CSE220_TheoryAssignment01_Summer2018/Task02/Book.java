public class Book{
    
    String name = "";
    String id = "";
    String author = "";
    String publisher = "";
    
    public Book(String n, String i, String a, String p){
        name = n;
        id = i;
        author = a;
        publisher = p;
    }
    
    public String toString(){
        return name + " " + id + " " + author + " " + publisher;
    }
}
