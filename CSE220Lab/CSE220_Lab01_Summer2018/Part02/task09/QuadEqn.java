public class QuadEqn{
    
    int a, b, c;
    
    public QuadEqn(int a1, int b1, int c1){
        a = a1;
        b = b1;
        c = c1;
    }
    
    String signOfA = "";
    String signOfB = "";
    String signOfC = "";
    
    if(a>0){
        signOfA = "";
    }else{
        signOfA = "-";
    }
    
    
    if(b<0) signOfB = "-";
    else signOfB = "+";
    
    if(c<0){
        signOfC = "-";
        c=c*-1;
    }else signOfC = "+";
    
    
    public String toString(){
        return "signOfA + "x2" + signOfB + "x" + c";
    }
}
