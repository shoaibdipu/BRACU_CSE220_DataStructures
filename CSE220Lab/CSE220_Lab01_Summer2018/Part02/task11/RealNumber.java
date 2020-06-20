public class RealNumber {
    
    private double realValue = 1.0;
    
    public double getRealValue() {
        return realValue;
    }
    
    public void setRealValue(double r) {
        realValue = r;
    }
    
    public RealNumber() {
    }
    
    public RealNumber(double r) {
        setRealValue(r);
    }
    public String toString() {
        return "RealPart: "+getRealValue();
    }
    public void ping() {
        System.out.println("I'm in RealNumber class");
    }
}
