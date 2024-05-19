public class Main{

    public static void main(String[] args) {
     menuNavigation();
    }

    public static void menuNavigation(){
        SystemPrint.showMenu();
        int input = OldStuff.inputIntNumber();
        if (input == 1)
        {
            OldStuff.showMenu();
        }
        else if (input == 2)
        {
            CreditCard.workWithCredit();
        }
        else
        {
            System.out.println("Oops, something went wrong");
            System.exit(1);
        }
    }
}
