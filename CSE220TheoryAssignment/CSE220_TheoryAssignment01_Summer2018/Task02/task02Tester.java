import java.util.*;
import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class task02Tester{
    public static void main(String [] args) throws IOException {
        
        Book BookArray [] = new Book [1000];
        
        int size = 2;
        int length = BookArray.length;
        
        File file = new File("/home/dipu/Desktop/CSE220Theory/Task02/Books.txt");
        Scanner sc = new Scanner(file);
        
        int count = 0;
        
        while (sc.hasNextLine()){
            String [] info = new String [4];
            int i = 0;
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreElements()){
                info[i] = (String)st.nextElement();
                i++;
            }
            
            String b1 = info[0];
            String b2 = info[1];
            String b3 = info[2];
            String b4 = info[3];
            
            Book b = new Book(b1, b2, b3, b4);
            
            BookArray[count] = b;
            
            count++;
        }
        
        for(int i=0; i<length; i++){
            if(BookArray[i]!=null){
                System.out.println(BookArray[i]);
            }
        }
    }
}


