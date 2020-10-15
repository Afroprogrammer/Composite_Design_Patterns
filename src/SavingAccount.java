public class SavingAccount implements Account {
    public SavingAccount(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    private String bankName;
    private double balance;


    @Override
    public void showAccountDetails() {
        System.out.println(bankName+" -"+balance);
    }
}
//It defines behavior for primitive objects in the composition. It represents leaf objects in the composition.