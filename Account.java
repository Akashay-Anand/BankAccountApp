package BankAccountApp;

// --------- Project by Akashay Anand --------------
/**
 * This is our parent class.(So most likely we would not create an object(instance) of this class).
 * Thes class can 'Inherited' by some other classes.
 * This class may contains some important methods, & child class can access it through inheritence. 
 */

 // making it abstract so that other can not create object of it; but they can access it through child class.
public abstract class Account implements BaseRate {
    // List common properties for saving and current accounts
    private String name;
    private String cif;
    protected String accountNumber;
    private double baserate;
    private double balance;
    private static int index = 10000;

    protected double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name , String cif, Double initialDeposit){
        this.name = name;
        this.cif = cif;
        this.balance = initialDeposit;

        // set account number
        index++;
        this.accountNumber = setAccountNumber();
        
        setRate();
    }
    
    public abstract void setRate();     // [Note]?

    private String setAccountNumber(){
        String lastTwoOfCIF = cif.substring(cif.length()-2,cif.length());
        int uniqueID = index;
        int randomnumber = (int)(Math.random() * 1000);
        return lastTwoOfCIF + uniqueID + randomnumber;
    }

    public void compound(){
        double interestcalculated = balance * (rate/100);
        System.out.println("Interest amount: "+interestcalculated);
        balance += interestcalculated;
        printBalance();
    }


    // List common methods

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit $"+amount);
        printBalance();
    } 
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdraw $" + amount);
        printBalance();
    }
    public void tranfer(String reciverID, double amount){
        balance -= amount;
        System.out.println("Transfered $"+amount+ " to " + reciverID);
        printBalance();
    }
    public void printBalance(){
        System.out.println("New Balance is: $"+balance);
    }

    public void showInfo(){
        System.out.println(
            "Name: " + name +
            "\nAccount Number: " + accountNumber +
            "\nBalance: " + balance  + 
            "\n Rate: " + rate
        );
    }

    
}

/*
 * [Note-1]: 'implement' keyword is use to provide access of 'interface' class. ; this concept is somehow similar to 'Inheritence' and 'extends'
 * 
 */