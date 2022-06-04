package BankAccountApp;

// --------- Project by Akashay Anand --------------

public class BankAccountApp {
    public static void main(String[] args) {

        CurrentAccount currentAc1 = new CurrentAccount("Anand","23456789012",4000);

        SavingAccount savingAc1 = new SavingAccount("Anand","12345678901",5000);

        // currentAc1.showInfo();
        System.out.println("************");
        savingAc1.showInfo();

        savingAc1.compound();

        savingAc1.deposit(5000);
        savingAc1.withdraw(500);
        savingAc1.tranfer("123456789", 2300);

        // Read a CSV file then create new accounts based on that data
    }
}
