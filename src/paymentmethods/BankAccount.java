package paymentmethods;



/**
 * Class associated with a bank account from a user.
 */
public class BankAccount extends PaymentMethod{

    //  Inherited attributes:
    //      - long identifier
    //      - int validationCode
    // Local Attributes:
    private int balance;        //  The balance in this account
    private String aliasName;   //  The alias for the bank account.


    public BankAccount(long identifier, int validationCode,
                       int balance, String aliasName){
        super(identifier, validationCode);
        this.balance = balance;
        this.aliasName = aliasName;
    }


    //  getters

    public int getBalance(){
        return this.balance;
    }

    public String getAliasName(){
        return this.aliasName;
    }

    //  Setters

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setAliasName(String aliasName){
        this.aliasName = aliasName;
    }

}
