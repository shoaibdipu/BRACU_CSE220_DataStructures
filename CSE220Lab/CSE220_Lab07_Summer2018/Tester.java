import java.util.*;

public class Tester{
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Implement With 1.Array Or 2.List Queue");
        int primChoice = sc.nextInt();
        
        if(primChoice==1){
            
            WRM1 w = new WRM1();
            
            int id = 1001;
            
            int i=1;
            
            while(i==1){
                System.out.print("Enter Your Choice");
                System.out.print("\n 1 For Register Patient");
                System.out.print("\n 2 For Serve Patient");
                System.out.print("\n 3 For Cancel All Appointments");
                System.out.print("\n 4 For Showing All Patients");
                System.out.print("\n 5 For Query : Can Doctor Go Home?");
                
                
                int choice = sc.nextInt();
                
                if(choice==1){
                    w.RegisterPatient();
                    w.tempShow();
                }else if(choice==2){
                    w.ServePatient();
                    w.tempShow();
                }else if(choice==3){
                    w.CancelAll();
                    w.tempShow();
                }else if(choice==4){
                    System.out.println(w.ShowAllPatient());
                    w.tempShow();
                }else if(choice==5){
                    w.CanDoctorGoHome();
                    w.tempShow();
                }
                
                System.out.println("Enter 1 To Continue");
                System.out.println("Enter 0 To Break");
                
                int terminalChoice = sc.nextInt();
                
                if(terminalChoice==1) i=1;
                else i=0;
            }
            
        }else if(primChoice==2){
            
            WRM2 w = new WRM2();
            
            int id = 1001;
            
            int i=1;
            
            while(i==1){
                System.out.print("Enter Your Choice");
                System.out.print("\n 1 For Register Patient");
                System.out.print("\n 2 For Serve Patient");
                System.out.print("\n 3 For Cancel All Appointments");
                System.out.print("\n 4 For Showing All Patients");
                System.out.print("\n 5 For Query : Can Doctor Go Home?");
                
                
                int choice = sc.nextInt();
                
                if(choice==1){
                    w.RegisterPatient();
                    w.tempShow();
                }else if(choice==2){
                    w.ServePatient();
                    w.tempShow();
                }else if(choice==3){
                    w.CancelAll();
                    w.tempShow();
                }else if(choice==4){
                    System.out.println(w.ShowAllPatient());
                    w.tempShow();
                }else if(choice==5){
                    w.CanDoctorGoHome();
                    w.tempShow();
                }
                
                System.out.println("Enter 1 To Continue");
                System.out.println("Enter 0 To Break");
                
                int terminalChoice = sc.nextInt();
                
                if(terminalChoice==1) i=1;
                else i=0;
            }
            
        }
        
        
    }
}

