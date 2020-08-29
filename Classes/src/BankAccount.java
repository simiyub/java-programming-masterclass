public class BankAccount {

    private final String accountNumber;
    private String customerName;
    private String email;
    private String phone;
    private double balance;

    public BankAccount(String accountNumber, String customerName, String email, String phone) {
        this.accountNumber=accountNumber;
        this.customerName=customerName;
        this.email=email;
        this.phone=phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        balance+=amount;
        System.out.println("deposited "+amount+". New balance="+balance);
        return true;
    }

    public void printDetails() {
        System.out.println("Account details: Name="+customerName+",Phone="+ phone+",Email="+email+",Balance="+balance);

    }

    public double withdraw(double amount) {
        if(balance>=amount){
            balance-=amount;
            System.out.println("withdrew "+amount+". New balance="+balance);
        }
        else{
            System.out.println("insufficient funds. cannot withdraw "+amount+" from current balance of "+balance);
        }
        return balance;
    }
}
