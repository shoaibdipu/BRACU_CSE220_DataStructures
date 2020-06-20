/* 
 * Circular Array
 * CSE220 LAB 03
 * SHOAIB AHMED DIPU
 * ID : 17 10 14 82
 */

public class CircularArray{
    
    private int start;
    private int size;
    private Object [] cir;
    
    public CircularArray(Object [] lin, int st, int sz){
        start=st;
        size=sz;
        
        cir=new Object[lin.length];
        int s=start;
        
        for(int i=0; i<lin.length; i++){
            cir[s]=lin[i];
            s=(s+1)%lin.length;
        }
    }
    
    public void printFullLinear(){
        for(int i=0; i<cir.length; i++){
            if(i!=cir.length-1) System.out.print(cir[i]+", ");
            else System.out.print(cir[i]+"."+"\n");
        }
    }
    
    public void printForward(){
        int s = start; 
        int j = (start + size - 1)%cir.length;
        for(int i=0; i<size-1; i++){ 
            System.out.print(cir[s] + ", "); 
            s = (s+1)%cir.length; 
        }
        System.out.print(cir[j] + "." + "\n");
    }
    
    public void printBackward(){
        int s=start-1;
        if(s<0){
            s=s+cir.length;
        }
        
        for(int i=0; i<cir.length; i++){
            if(cir[s]!=null && i!=cir.length-1){
                System.out.print(cir[s]+", ");
            }else if(cir[s]!=null && i==cir.length-1){
                System.out.print(cir[s]+"."+"\n");
            }
            s=s-1;
            if(s<0) s = s + cir.length;
        }
    }
    
    public void linearize(){
        Object[] a=new Object[size];
        int j=start;
        for(int i=0; i<a.length; i++){
            a[i]=cir[j];
            j=(j+1)%cir.length;
        }
        cir=a;
    }
    
    public void resizeStartUnchanged(int newcapacity){
        Object[] array=new Object[newcapacity];
        int j=start;
        int k=start;
        for(int i=0; i<size; i++){
            array[j]=cir[k];
            k=(k+1)%cir.length;
            j=(j+1)%array.length;
        }
        cir=array;
    }
    
    public void resizeByLinearize(int newcapacity){
        Object[] array=new Object[newcapacity];
        int j=start;
        for(int i=0; i<size; i++){
            array[i]=cir[j];
            j=(j+1)%cir.length;
        }
        cir=array;
    }
    
    public void insertByRightShift(Object elem, int pos){
        Object[] ar;
        if(size==cir.length){
            resizeStartUnchanged(size+3);
        }
        ar=cir;
        int k=(start+size)%ar.length;
        for(int i=pos; i<size; i++){
            ar[k]=ar[k-1];
            k--;
            if(k<0){
                k=ar.length-1;
            }
        }
        ar[start+pos]=elem;
        size=size+1;
        cir=ar;
    }
    
    public void insertByLeftShift(Object elem, int pos){
        Object[] a;
        if(size==cir.length){
            resizeStartUnchanged(size+3);
        }
        a=cir;
        int k=start;
        for(int i=0; i<=pos; i++){
            a[(k-1)%a.length]=a[k];
            k=(k+1)%a.length;
        }
        a[pos+start]=elem;
        start=(start-1)%a.length;
        size=size+1;
        cir=a;
    }
    
    public void removeByLeftShift(int pos){
        int k=(start+pos)%cir.length;
        int ns = size - pos + 1;
        
        for(int i=0; i<ns; i++){
            cir[k]=cir[(k+1)%cir.length];
            k=(k+1)%cir.length;
        }
        cir[(start+size-1)%cir.length]=null;
        size=size-1;
    }
    
    public void removeByRightShift(int pos){
        int j=(start+pos)%cir.length;
        int ns = size-pos + 1;
        
        for(int i=0; i<ns; i++){
            cir[j]=cir[(j-1)%cir.length];
            j--;
            if(j<0){
                j=cir.length-1;
            }
        }
        
        cir[start]=null;
        start=start+1;
        size=size-1;
    }
    
    public void palindromeCheck(){
        int count = 0;
        int x = start;
        int y = (start+size-1)%cir.length;
        
        for(int i=0; i<size/2; i++){
            if(cir[x]!=cir[y]){
                System.out.println("This array is NOT a palindrome.");
                break;
            }else{
                count++;
            }
        }
        if(count==size/2) System.out.println("This array is a palindrome.");
    }
    
    public void sort(){
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if((Integer)cir[(i+start)%cir.length]>(Integer)cir[(j+start)%cir.length]){
                    Object temp=cir[(i+start)%cir.length];
                    cir[(i+start)%cir.length]=cir[(j+start)%cir.length];
                    cir[(j+start)%cir.length]=temp;
                }
            }
        }
    }
    
    public boolean equivalent(CircularArray k){
        
        if(size==k.size){
            
            int start1=start;
            int start2=k.start;
            
            for(int i=0;i<size;i++){
                if(cir[start1]!=k.cir[start2]){
                    return false;
                }
                
                start1=(start1+1)%cir.length;
                start2=(start2+1)%k.cir.length;
            }
            return true;
        }
        else{
            return false;
        }
    } 
}

