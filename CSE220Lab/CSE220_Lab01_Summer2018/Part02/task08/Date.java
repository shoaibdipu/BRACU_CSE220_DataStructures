public class Date{
    int month;
    int day;
    int year;
    
    public Date(int m, int d, int y){
        setMonth(m);
        setDay(d);
        setYear(y);
    }
    
    public int getMonth(){
        return month;
    }
    public void setMonth(int m){
        month = m;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int d){
        day = d;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int y){
        year = y;
    }
    public void displayDate(){
        System.out.println(getMonth() + " / " + getDay() + " / " + getYear());
    }
}


