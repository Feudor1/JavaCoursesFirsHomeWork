public class FlatCustomer {
    int customerID;
    String customerName;
    int customerAge;
    boolean customerRegistred;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public boolean isCustomerRegistred() {
        return customerRegistred;
    }

    public void setCustomerRegistred(boolean customerRegistred) {
        this.customerRegistred = customerRegistred;
    }

    public FlatCustomer(int customerID, String customerName, int customerAge, boolean customerRegistred) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerRegistred = customerRegistred;
    }

    public String  getCustomerInfo(){
        return "Customer ID is: " + getCustomerID() +
                ", Customer name is: " + getCustomerName() +
                ", Customer age is: " + getCustomerAge() +
                ", Is Customer registered: " + isCustomerRegistred();
    }
}
