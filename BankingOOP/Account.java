package BankingOOP;

public abstract class Account {
    

    //what data would we want to hold about an account
    public String holdersName;
    public int accountNumber;
    public double balance;

    //

    


    //abstract method - all children can transfer
    abstract void transfer();

    abstract void deposit();

    abstract void withdrawal();
    
    //abstract void debit();

    //abstract void credit();




}
