public class Address {
    String state;
    String district;
    String city;
    String street;
    int doorNumber;
    public Address(int doorNumber,String street,String city,String district,String state){
        this.state = state;
        this.district = district;
        this.city = city;
        this.street = street;
        this.doorNumber = doorNumber;
    }
}
