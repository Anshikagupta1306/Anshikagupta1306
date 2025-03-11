import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank account = null;

        while (true) {
            System.out.println("\n======= BANKING SYSTEM MENU =======");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change Address");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (account == null) {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Address: ");
                        String address = sc.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();
                        account = new Bank(name, address, balance);
                        System.out.println("Account Created Successfully!");
                    } else {
                        System.out.println("Account already exists!");
                    }
                    break;

                case 2:
                    if (account != null) {
                        account.deposit();
                    } else {
                        System.out.println("No account found! Create an account first.");
                    }
                    break;

                case 3:
                    if (account != null) {
                        account.withdraw();
                    } else {
                        System.out.println("No account found! Create an account first.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.changeAddress();
                    } else {
                        System.out.println("No account found! Create an account first.");
                    }
                    break;

                case 5:
                    if (account != null) {
                        account.display();
                    } else {
                        System.out.println("No account found! Create an account first.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting... ");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
   
    }
}
class Bank{
    String Name;
    String Address;
    double Balance;
    int AccNumber;
    static int AccNo=1001;

    public Bank(String n,String a,double b){
        this.Name=n;
        this.Address=a;
        this.Balance=b;
        this.AccNumber=AccNo++;
    }

    public void display(){
        System.out.println("Name of the depositor:"+ Name);
        System.out.println("Address of the depositor:"+ Address);
        System.out.println("Balance:"+ Balance);
        System.out.println("Account number:"+ AccNumber);
    }
    
    public void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amopunt to deposit:");
        double a=sc.nextDouble();
        Balance+=a;
        System.out.println("amount deposited successfully!");
    }

    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount to withdraw:");
        double a=sc.nextDouble();
        if(a>Balance){
            System.out.println("Insufficient Balance!");
        }
        else{
            Balance-=a;
            System.out.println("amount withdrawn sucessfully!");
        }
    }

    public void changeAddress(){
        System.out.println("Enter new Address:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Address=a;
        System.out.println("Address changes successfully!");
    }
}
