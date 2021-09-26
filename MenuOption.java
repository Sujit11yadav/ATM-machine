import java.text.DecimalFormat;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;
//import java.util.;
public class MenuOption extends Account{
    Scanner menuInput= new Scanner(System.in);
    DecimalFormat moneyformat= new DecimalFormat("'$',###,##0.00");
    HashMap <Integer, Integer> data= new HashMap<Integer, Integer>();
    public void getLogin() throws IOException {
        int x=1;
        do{
            try{
                data.put(4567890, 2575);
                data.put(6543210, 1073);

                System.out.println("Welcome to the ATM Machine!!!");

                System.out.print("Enter The Account Number: ");
                setAccountNumber(menuInput.nextInt());

                System.out.print("Enter Your PIN Number: ");
                setPinNumber(menuInput.nextInt());

            }
            catch(Exception e)
            {
                System.out.println("/n" + "Invalid Character(s). Only Numbers." + "/n");
                x=2;
            }
            for (Entry <Integer, Integer> entry: data.entrySet())
            {
                if(entry.getKey()==getAccountNumber() && entry.getValue()==getPinNumber()  ){
                getAccountType();
            }

        }
            System.out.println("/n" + "Wrong Customer Number or PIN Number."+ "/n");       

    } while (x==1);

}

        public void getAccountType(){
            System.out.println("Select The Account You want to Access:");
            System.out.println("Type 1 - Checking Account.");
            System.out.println("Type 2 - Saving Account");
            System.out.println("Type 3 - Exit");
            System.out.println("Choice:");
        

        selection=menuInput.nextInt();

        switch(selection){
            case 1:
                getChecking();
                break;
    
            case 2:
                getSaving();
                 break;

            case 3:
                System.out.println("Thank You for using this ATM!! Have a Nice day!!!");
                break;
                default:
                System.out.println("/n" + "Invalid Choice" + "/n");
                getAccountType();
        }
        }
        public void getChecking(){
            System.out.println("Checking Account");
            System.out.println("Type 1 - View Balance");
            System.out.println("Type 2 - Withdraw Money");
            System.out.println("Type 3 - Deposit Money");
            System.out.println("Type 4 - Exit");
            System.out.println("Choice");

            selection=menuInput.nextInt();

            switch(selection){
            case 1:
                System.out.println("Checking Account Blance: " + moneyformat.format(getCheckingBlance()));
                getAccountType();
                //getChecking();
                break;
    
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                //getSaving();
                 break;

            case 3:
            getCheckingDepositInput();
            getAccountType();
            break;

            case 4:
            System.out.println("Thank You for using this ATM!! Have a Nice day!!!");
                break;
                default:
                System.out.println("/n" + "Invalid Choice" + "/n");
                getChecking();

            }   

        }

        public void getSaving(){
         System.out.println("Saving Account");   
         System.out.println("Type 1 - View Balnce");   
         System.out.println("Type 2 - Withdraw Money");   
         System.out.println("Type 3 - Deposit Money");   
         System.out.println("Type 4 - Exit");   
         System.out.println("Choice: ");

         selection=menuInput.nextInt();

             switch(selection){
                    case 1:
                    System.out.println("Saving Account Balance:" + moneyformat.format(getSavingBlance()));
                    getAccountType();
                    break;
                    case 2:
        
                getSavingWithdrawInput();
                getAccountType();
                
                 break;

            case 3:

            getSavingWithdrawInput();
            getAccountType();
            break;
            case 4:
             System.out.println("Thank You for using this ATM!! Have a Nice day!!!");
                break;
                default:
                System.out.println("/n" + "Invalid Choice" + "/n");
                getSaving();
    } }   

        int selection;
        
}