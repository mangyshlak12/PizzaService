import java.util.ArrayList;
import java.util.List;

public class Customer {
    List<Order> orders = new ArrayList<>();
    Address address;
    long mobile;
    String email;
    String customerName;
    int customerId;
    public Customer(int id, String name, String email, long mobile, Address adr){
        this.address = adr;
        this.customerId = id;
        this.customerName = name;
        this.mobile = mobile;
        this.email = email;
    }
    @Override()
    public String toString(){
        return "Customer Details => ID: " + customerId + ", Name: " + customerName + ", Email: " + email +", Mobile: " + mobile + "\n" +
                "Address => Door Number: " + address.doorNumber + ", Street: " + address.street + ", City: " +address.city + ", District: " + address.district + ", State: " + address.state;
    }
    public void addOrder(Order ord){
        orders.add(ord);
    }
    public double billAmount(){
        double sum = 0;
        for(Order i: orders){
            sum+= i.payableBill;
        }
        return sum;
    }
}
