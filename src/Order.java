import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Pizza> pizzas = new ArrayList<>();
    String orderDescription;
    double payableBill;
    String orderDate;
    int orderId;
    public Order(){}
    public Order(int id, String date, double bill, String desc){
        this.orderId = id;
        this.orderDate = date;
        this.payableBill = bill;
        this.orderDescription = desc;
    }
}
