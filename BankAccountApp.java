package BankAccountProject;

import java.util.List;

// --------- Project by Akashay Anand --------------

public class BankAccountApp {

    static int flag = 0;
    static String name;
    static String cif;
    static String accountType;
    static double initialDeposit;

    public static void main(String[] args) {

        
        ClassResource res = new ClassResource();
        Account accountOBJ;
        // CurrentAccount currentAc1 = new CurrentAccount("Anand","23456789012",4000);
        // SavingAccount savingAc1 = new SavingAccount("Anand","12345678901",5000);

        res.startDekay(3000);

        
        
        
        // currentAc1.showInfo();
        // System.out.println("************");
        // savingAc1.showInfo();
        // savingAc1.compound();
        // savingAc1.deposit(5000);
        // savingAc1.withdraw(500);
        // savingAc1.tranfer("123456789", 2300);
        
        // Read a CSV file then create new accounts based on that data

        // String file = "BankAccountApp\\BankAccountData.csv";
        // String file = "D:\\Java Projects\\BankAccountProject\\UsersAccountInfo.csv";
        // List<String[]> newAccountHolder = CSVfile.read(file);
        // System.out.println("-----Accounts-------");
        // for(String[] accountHolder : newAccountHolder){
        //     name = accountHolder[0];
        //     cif = accountHolder[1];
        //     accountType = accountHolder[2];
        //     initialDeposit = Double.parseDouble(accountHolder[3]);

        //     System.out.println("name: " + name + "cif no.: " + cif + "Account Type: "+accountType + "Initial Deposite: "+ initialDeposit);
        // }
    }
}
