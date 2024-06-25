import java.util.Scanner;
//import class BankAccount;
public class ATMInterface {

    public static void main(String[] args) {
        BankAccount account =new BankAccount(1000);
        ATM atm =new ATM(account);
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("\n ATM MENU: ");
            System.out.println("1. WITHDRAW ");
            System.out.println("2. DEPOSIT ");
            System.out.println("3. CHECK BALANCE ");
            System.out.println("4. EXIT ");
            System.out.println("Choose an Option: ");


            int choice =sc.nextInt();


            switch (choice){
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount =sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thanksyou for using the ATM. Please visit us soon!");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again. ");
            }
        }
    }
}
