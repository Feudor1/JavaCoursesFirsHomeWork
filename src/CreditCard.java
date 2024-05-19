public class CreditCard {
    int id ;
    int accountNumber;
    double amount;


    public CreditCard(int id, int accountNumber, double amount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double addMoney() {
        getAmount();
        System.out.println("Input the amount that you want to put to your account:");
        double incomingAmount = OldStuff.inputDoubleNumber();
        this.amount = amount + incomingAmount;
        return amount;
    }

    public double Withdrawmoney(){
        amount = getAmount();
        System.out.println("Input the amount that you want to withdraw form your account:");
        double outgoingAmaunt = OldStuff.inputDoubleNumber();
        while ((amount - outgoingAmaunt) <0 )
        {
            System.out.println("The current amount is < 0, enter the valid amount. The current balance is " + getAmount());
            outgoingAmaunt = OldStuff.inputDoubleNumber();
        }
        amount = amount - outgoingAmaunt;
        return amount;
    }
    public  String getAccountInfo(){
        return "Your ID is: " + getId() +
                ", Your account number is: " + getAccountNumber() +
                ", The current balance is " + getAmount();

    }
    public static void subMenuOptions(){
        System.out.println("Choose what you want to do with this user");
        System.out.println("Type 4 to withdraw money");
        System.out.println("Type 5 add money");
        System.out.println("Type 6 to see the info again");
    }

    public static void workWithCredit()
    {
        CreditCard IvanovIvan = new CreditCard(1,100,100.00);
        CreditCard PetrovPetr = new CreditCard(2,200,300.00);
        CreditCard SidorovSidr = new CreditCard(3,300,400.00);
        boolean flag = true;
        int menuSelector;
        while (flag = true){
            System.out.println("Choose the User that yoy want to work with: type 1 to work with user which id = 1, etc.");
            menuSelector = OldStuff.inputIntNumber();
            if (menuSelector == 1)
            {
                System.out.println("You have chosen " + IvanovIvan.getAccountInfo());
                subMenuOptions();
                menuSelector = OldStuff.inputIntNumber();
                if (menuSelector ==4){
                    IvanovIvan.Withdrawmoney();
                    System.out.println("The new amount is " + IvanovIvan.getAmount());
                } else if (menuSelector ==5) {
                    IvanovIvan.addMoney();
                    System.out.println("The new amount is " + IvanovIvan.getAmount());
                }
                else if (menuSelector ==6) {
                    System.out.println("The new amount is " + IvanovIvan.getAccountInfo());
                }
            }
            else if (menuSelector == 2)
            {
                System.out.println("You have chosen " + PetrovPetr.getAccountInfo());
                subMenuOptions();
                menuSelector = OldStuff.inputIntNumber();
                if (menuSelector ==4){
                    PetrovPetr.Withdrawmoney();
                    System.out.println("The new amount is " + PetrovPetr.getAmount());
                } else if (menuSelector ==5) {
                    PetrovPetr.addMoney();
                    System.out.println("The new amount is " + PetrovPetr.getAmount());
                }
                else if (menuSelector ==6) {
                    System.out.println("The new amount is " + PetrovPetr.getAccountInfo());
                }
            }
            else if (menuSelector == 3)
            {
                System.out.println("You have chosen " + SidorovSidr.getAccountInfo());
                subMenuOptions();
                menuSelector = OldStuff.inputIntNumber();
                if (menuSelector ==4){
                    SidorovSidr.Withdrawmoney();
                    System.out.println("The new amount is " + SidorovSidr.getAmount());
                } else if (menuSelector ==5) {
                    SidorovSidr.addMoney();
                    System.out.println("The new amount is " + SidorovSidr.getAmount());
                }
                else if (menuSelector ==6) {
                    System.out.println("The new amount is " + SidorovSidr.getAccountInfo());
                }
            }
            System.out.println("Do you want to use this program once again? Type true to use or false to exit");
            flag = OldStuff.InputBoolean();
            if (flag == false){
                Main.menuNavigation();
            }
        };
    }
}
