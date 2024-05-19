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
        else if (input == 3)
        {
            Flat flat = new Flat(1, 90, 300,
                    new FlatOwner(1, "Ivanov Ivan", "+7 999 88 77"),
                    new FlatCustomer(1, "Petrov Petr", 33, false));
            Flat Lenina2 = new Flat(2,100,500);
            System.out.println(flat.showLenina1Info());
            System.out.println(Lenina2.showLenina2Info());
        }
        else
        {
            System.out.println("Oops, something went wrong");
            System.exit(1);
        }
    }
}
