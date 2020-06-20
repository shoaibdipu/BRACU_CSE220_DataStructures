public class Square{
    
    double height, width;
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double h){
        height = h;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double w){
        width = w;
    }
    
    public double getArea(){
        return height * width;
    }
}