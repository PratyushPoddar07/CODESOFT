public class ATM {
    private BankAccount account;
    public  ATM(BankAccount account){
        this.account =account;
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Amount must be greater than Zero to withdraw.");
            return;
        }
        if(account.getBalance() >= amount){
            account.setBalance(account.getBalance() - amount);
            System.out.println("Successfully withdrew: RS: "+amount);
            checkBalance();
        }else{
            System.out.println("Insufficient balance.");
        }
    }
    public void deposit(double amount){
        if(amount <=0){
            System.out.println("Amount must be greater then '0'. ");
            return;
        }
        account.setBalance(account.getBalance() + amount);
        System.out.println("Successfuly deposited: RS: "+amount );
        checkBalance();
    }
    public void checkBalance(){
        System.out.println("Your Balance remain: "+account.getBalance());
    }
}
