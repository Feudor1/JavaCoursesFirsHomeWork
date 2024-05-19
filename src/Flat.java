public class Flat {

    int id;
    int square;
    double price;
    FlatOwner FlatOwner = new FlatOwner(1,"Ivanov Ivan","+7 999 88 77");
    FlatCustomer FlatCustomer = new FlatCustomer(1,"Petrov Petr",33, false);
    //Flat Lenina1 = new Flat(1,90,300,FlatOwner,FlatCustomer);
    //Flat Lenina2 = new Flat(2,100,500);

    public Flat(int id, int square, double price) {
        this.id = id;
        this.square = square;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Flat(int id, int square, double price, FlatOwner flatOwner, FlatCustomer flatCustomer) {
        this.id = id;
        this.square = square;
        this.price = price;
        FlatOwner = flatOwner;
        FlatCustomer = flatCustomer;
    }
    public String showLenina1Info() {
        this.id = getId();
        this.price = getSquare();
        this.square = getSquare();
        return FlatOwner.getOwnerInfo() + "\n" +
                FlatCustomer.getCustomerInfo() + "\n" +
                "Flat ID is: " + id +
                ", Flat price is: " + price +
                ", Flat square is: " + square;
    }

    public String showLenina2Info() {
        this.id = getId();
        this.price = getSquare();
        this.square = getSquare();
        return "Flat ID is: " + id +
                ", Flat price is: " + price +
                ", Flat square is: " + square;
    }

}
