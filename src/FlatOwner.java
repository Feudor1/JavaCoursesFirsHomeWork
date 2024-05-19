public class FlatOwner {
    int ownerId;
    String ownerName;
    String ownerPhone;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public FlatOwner(int ownerId, String ownerName, String ownerPhone) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerInfo(){
        return "Owner ID is: " + getOwnerId() +
                ", Owner name is: " + getOwnerName() +
                ", Owner phone is: " + getOwnerPhone();
    }
}
