import com.modelclass.BankAccount;
import com.modelclass.Employee;
import com.modelclass.Intern;
import com.modelclass.Manager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Manager employee =new Manager("Jack Snyder",25000,15);
        Intern intern = new Intern("Marc Spider",16000,"Harvard University");

        System.out.println(intern.getDetails());
        System.out.println(employee.getDetails());
        BankAccount account = new BankAccount();

        // Call the Withdraw() method on the instance
        boolean withdraw = account.Withdraw(15);

        if (withdraw){
            System.out.println("The withdrawl is successfull!!");
        }
       else {
            System.out.println("The withdrawl is not successfull!!");
       }


        account.Deposit(30);

        double balance=account.GetBalance();
        System.out.println("The remaining balance for account number "+account.accountHoldersNumber+" is "+balance);

    }
}