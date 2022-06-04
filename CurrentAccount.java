package BankAccountApp;

// [Note-1]- 'extends'
public class CurrentAccount extends Account{
    // List properties specific to a Checking account
    long debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize current account properties
    public CurrentAccount(String name, String cif, double initialDeposit){
        super(name, cif, initialDeposit);
        accountNumber = "2" + accountNumber;

        setDebitCard();
    }
    // List any methods specific to the current account

    public void setDebitCard(){
        debitCardNumber = (long)( Math.random() * Math.pow(10, 12) );
        debitCardPIN = (int)( Math.random() * 10000);
    }

    @Override
    public void setRate() {
       rate = getBaseRate() * 0.15;    
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Current Account" +
                            "\n Debitcard Number: "+ debitCardNumber +
                            "\n Debitcard pin: "+ debitCardPIN 
                            );
    }


}

/*
 * [Note-1]: 'extends' keyword is use to inherit other class and create parent-child(CurrentAccount == child; Account == parent) relationship.. So that, child can access method and field of parent.
 * 
 * 
 */