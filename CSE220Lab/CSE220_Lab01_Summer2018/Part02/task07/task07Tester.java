public class task07Tester{
    public static void main(String [] args){
        
        BankAccount acc1 = new BankAccount("AAA", "Uttara", "01", 500.00);
        BankAccount acc2 = new BankAccount("BBB", "Mohakhali", "02", 750.00);
        BankAccount acc3 = new BankAccount("CCC", "Dhanmondi", "03", 825.00);
        
        acc1.addInterest();
        acc3.addInterest();
        
        
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        
    }
}
