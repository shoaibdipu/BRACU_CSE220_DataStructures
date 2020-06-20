public class ComplexNumber extends RealNumber{
    
    private double complexValue = 1.0;
    
    public double getComplexValue() {
        return complexValue;
    }
    
    public void setComplexValue(double c) {
        complexValue = c;
    }
    
    public ComplexNumber() {
    }
    
    public ComplexNumber(int r, int c) {
        super((double)r);
        setComplexValue(c);
    }
    
    public String toString() {
        return  super.toString()+"\n"+"ImaginaryPart: "+getComplexValue();
    }
    public void ping() {
        System.out.println("I'm in ComplexNumber class");
        super.ping();
    }
    
    public void check(){
        ping();
        System.out.println("Checking ended.");
    }
    
}
