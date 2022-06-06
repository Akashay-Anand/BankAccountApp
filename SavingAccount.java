package BankAccountApp;

// [Note-1]: 'extends' ; 
public class SavingAccount extends Account {
    // List properties specific to saving account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    // Constructor to initialize settings for the savings properties
    public SavingAccount(String name, String cif, double initialDeposit){
        super(name, cif, initialDeposit);
        accountNumber = "1" + accountNumber;

        setSafetyDepositBox();
    }
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * 1000);
        safetyDepositBoxKey = (int)(Math.random() * 10000);
    }
    // List any methods specific to saving account

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Saving Account" +
                            "\n safety deposit Box Id: "+ safetyDepositBoxID +
                            "\n safety deposit Box key: "+ safetyDepositBoxKey
                            );
    }

}

/*
 * [Note-1]: 'extends' keyword is use to inherit other class and create parent-child(SavingAccount == child; Account == parent) relationship.. So that, child can access method and field of parent.
 * 
 * 
 */
