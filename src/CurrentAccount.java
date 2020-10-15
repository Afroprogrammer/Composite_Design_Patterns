public class CurrentAccount implements Account {
    public CurrentAccount(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    private String bankName;
    private double balance;

    @Override
    public void showAccountDetails() {

    }
}
//It defines behavior for primitive objects in the composition. It represents leaf objects in the composition.