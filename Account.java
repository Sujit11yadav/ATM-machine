import java.text.DecimalFormat;
import java.util.Scanner;
public class Account{
    Scanner input= new Scanner(System.in);
    DecimalFormat moneyformat= new DecimalFormat("'$', ###, ##0.00");

    public int setAccountNumber(int accountNumber){
        this.accountNumber= accountNumber;
        return accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int setPinNumber(int pinNumber){
        this.pinNumber= pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }

    public double getCheckingBlance(){
        return checkingBalance;
    }

    public double getSavingBlance(){
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount){
        checkingBalance= (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount){
        savingBalance= (savingBalance - amount);
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount){
        checkingBalance= (checkingBalance + amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount){
        savingBalance= (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " +  moneyformat.format(checkingBalance));
        System.out.print("Amount You Want To Wihdrawal From Checking Account: ");
        double amount= input.nextDouble();

        if((checkingBalance - amount)>= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Accoount Balance:" + moneyformat.format(checkingBalance));

        }else{
            System.out.println("Balance can't be Negative" + "/n");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Blance: " +  moneyformat.format(savingBalance));
        System.out.print("Amount You Want To Wihdrawal From saving Account: ");
        double amount= input.nextDouble();

        if((savingBalance - amount)>= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Accoount Blance." + savingBalance + "/n");

        }else{
            System.out.println("Balance can't be Negative." + "/n");
        }
    }


     public void getCheckingDepositInput(){
        System.out.println("Checking Account Blance: " +  moneyformat.format(checkingBalance));
        System.out.print("Amount You Want To Deposit From Checking Account: ");
        double amount= input.nextDouble();

        if((checkingBalance + amount)>= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Accoount Blance" + moneyformat.format(checkingBalance));

        }else{
            System.out.println("Balance can't be Negative" + "/n");
        }
    }

    public void getSavingDeppositInput(){
        System.out.println("Saving Account Blance: " +  moneyformat.format(savingBalance));
        System.out.print("Amount You Want To Deposit From Saving Account: ");
        double amount= input.nextDouble();

        if((savingBalance + amount)>= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Accoount Blance" + moneyformat.format(savingBalance));

        }else{
            System.out.println("Balance can't be Negative" + "/n");
        }
    }

    private int accountNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;






}







