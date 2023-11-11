public class Account {
    private float balance;

    public void deposit(float amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Amount cannot be negative.");

        balance += amount;
    }

    public void setBalance(float balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be negative.");

        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }
}
