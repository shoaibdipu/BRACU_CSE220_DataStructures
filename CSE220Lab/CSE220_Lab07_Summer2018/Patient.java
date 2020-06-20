/*
 * You need to have a Patient class so that you can create 
 * an instance of it (patient)
 * by assigning name (String), age (integer) and blood group (String).
 */

public class Patient{
    
    String name = "";
    int id = 0;
    int age = 0;
    String bg = "";
    
    public Patient(String name, int id, int age, String bg){
        this.name = name; 
        this.id = id;
        this.age = age;
        this.bg = bg;
    }
    
    public String toString(){
        return name + " " + id + " " + age + " " + bg + "\n";
    }
    
}


