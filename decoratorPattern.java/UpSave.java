public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String showAccountType() {
        return "UpSave";
    }

    public Double getInterestRate() {
        return 0.04;
    }

    public Double getBalance() {
        return bankAccount.getBalance();
    }

    public String showBenefits() {
        return bankAccount.showBenefits() + " With Insurance";
    }

    public Double computeBalanceWithInterest() {
        return getBalance() + (getBalance() * getInterestRate());
    }

    public String showInfo() {
        return bankAccount.showInfo();
    }

}