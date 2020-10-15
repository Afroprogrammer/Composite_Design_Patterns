public class User {
    // the client  components that manipulates the objects in the composition through the component interface
    public static void main(String[] args) {
 SavingAccount GN = new SavingAccount("GN Bank", 40000.00);
 SavingAccount AS = new SavingAccount("Access Bank", 50000.00);
 SavingAccount AB = new SavingAccount("Absa", 67000.00);
 SavingAccount ZN = new SavingAccount("Zenith Bank", 78000.00);


 BankAccount savingBankAccount = new BankAccount();
 savingBankAccount.addAccount(GN);
 savingBankAccount.addAccount(AS);
 savingBankAccount.addAccount(AB);
 savingBankAccount.addAccount(ZN);

        CurrentAccount LP = new CurrentAccount("LOWER PRA RURAL", 45600.00);
        CurrentAccount AP = new CurrentAccount("APEX BANK", 45600.00);
        CurrentAccount MP = new CurrentAccount("MPOUNUA", 45600.00);


        BankAccount currentBankAccount = new BankAccount();
        currentBankAccount.addAccount(LP);
        currentBankAccount.addAccount(AP);
        currentBankAccount.addAccount(MP);

        BankAccount allBankAccounts = new BankAccount();


        allBankAccounts.addAccount(savingBankAccount);
        /* comment this code below to see how the composite implement child relations*/

        //  allBankAccounts.showAccountDetails();
//        System.out.println("-------------------------- current account");

//        allBankAccounts.removeAccount(savingBankAccount);
//        allBankAccounts.showAccountDetails();
    }
}
