package com.epam.Design_Pattern_Command;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAmount(10);

        BankManager bankManager = new BankManager();

        Operation operation = new DepositOperation(200, account);

        bankManager.add(operation);

        System.out.println(account.getAmount());

        bankManager.remove();

        System.out.println(account.getAmount());


    }
}
