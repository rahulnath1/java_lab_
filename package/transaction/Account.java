
package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account a) {

        System.out.println("\n----- Transaction Report -----");

        System.out.println("Account Number: " + a.getAccountNumber());

        System.out.println("Available Balance: Rs. " + a.getBalance());

        System.out.println("------------------------------");
    }
}
