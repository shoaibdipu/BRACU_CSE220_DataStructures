public class Book{
    
    String name;
    int id;
    String author;
    String publisher;
    
    public Book(String n, int i, String a, String p){
        name = n;
        id = i;
        author = a;
        publisher = p;
    }
    
    public String toString(){
        return name + " " + id + " " + author + " " + publisher;
    }
    
    public int getId(){
        return id;
    }
    
    
}
