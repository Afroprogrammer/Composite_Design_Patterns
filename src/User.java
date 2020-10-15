public class User {
    public static void main(String[] args) {
 SavingAccount GN = new SavingAccount("GN Bank", 32_000.00);
 SavingAccount AS = new SavingAccount("Access Bank", 32_000.00);
 SavingAccount AB = new SavingAccount("Absa", 32_000.00);
 SavingAccount ZN = new SavingAccount("Zenith Bank", 32_000.00);


 BankAccount savingBankAccount = new BankAccount();
 savingBankAccount.addAccount(GN);
 savingBankAccount.addAccount(AS);
 savingBankAccount.addAccount(AB);
 savingBankAccount.addAccount(ZN);

        CurrentAccount LP = new CurrentAccount("LOWER PRA RURAL", 456_00.00);
        CurrentAccount AP = new CurrentAccount("APEX BANK", 456_00.00);
        CurrentAccount MP = new CurrentAccount("MPOUNUA", 456_00.00);


        BankAccount currentBankAccount = new BankAccount();
        currentBankAccount.addAccount(LP);
        currentBankAccount.addAccount(AP);
        currentBankAccount.addAccount(MP);

        BankAccount allBankAccounts = new BankAccount();
        allBankAccounts.addAccount(savingBankAccount);
        allBankAccounts.showAccountDetails();
        System.out.println("-------------------------- current account");
        allBankAccounts.removeAccount(savingBankAccount);
        allBankAccounts.showAccountDetails();
    }
}
