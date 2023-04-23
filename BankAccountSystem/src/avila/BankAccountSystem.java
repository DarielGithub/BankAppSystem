package avila;

import java.util.Scanner;

public class BankAccountSystem {
	public static void Divider() {
		System.out.println("--------------------------------------------");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance;
		int pin;
		int accountNumber;
        String accountType;
        char loop = 'Y';
		
        Divider();
		System.out.println("\tWelcome to Bank App System");
		Divider();
		
		System.out.print("Enter your Account number: ");
		accountNumber = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter your Account Type: ");
		accountType = sc.nextLine();
		
		System.out.print("Enter your balance: ");
		balance = sc.nextInt();
		
		BankTransaction transac = new BankTransaction(balance, accountNumber, accountType);
		
        do{
        	Divider();
        	System.out.print("Enter PIN: ");
            pin = sc.nextInt();
            
        	if(pin == 1223) {
        		Divider();
        		System.out.println("\nPlease choose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check balance");
                System.out.println();
                
                System.out.print("Enter: ");
                int choice = sc.nextInt();
                Divider();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        float depositAmount = sc.nextFloat();
                        transac.Deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        float withdrawalAmount = sc.nextFloat();
                        transac.Withdraw(withdrawalAmount);
                        break;
                    case 3:
                        transac.displayBalance();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                Divider();
                System.out.print("Do you want another transaction? [Y/N]: ");
                loop = sc.next().charAt(0);
        	}else {
        		System.out.println("Invalid PIN");
        	}
        }while(loop == 'Y' || loop == 'y');
        Divider();
        System.out.println("Thank you for using Bank App System");
        sc.close();
	}
}
