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
