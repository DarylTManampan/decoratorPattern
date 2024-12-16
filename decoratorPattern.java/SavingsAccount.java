public class SavingsAccount implements BankAccount {
    private int accountNumber; //The method setAccountNumber(String) in the type SavingsAccount is not applicable for the arguments (int)
    //in the UML diagram it is String but changed here changed to int
    private String accountName;
    private Double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String showAccountType() {
        return "Savings Account";
    }

    public Double getInterestRate() {
        return 0.01;
    }

    public Double getBalance() {
        return this.balance;
    }

    public String showBenefits() {
        return "Standard Savings Account, ";
    }

    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    public String showInfo() {
        return "Account number: " + this.accountNumber + 
        "\nAccount name: " + this.accountName + 
        "\nBalance: " + this.balance;
    }

}