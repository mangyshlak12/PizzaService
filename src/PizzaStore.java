import java.util.ArrayList;
import java.util.List;

public class PizzaStore {
    List<Customer> customers = new ArrayList<>();
    private List<Pizza> pizzas = new ArrayList<>();
    String storeLocation;
    String storeName;
    int storeId;
    public PizzaStore(){}
    public PizzaStore(int storeId,String storeName,String storeLocation){
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }
    public List<Pizza> getPizzas(){
        return pizzas;
    }
    public void setPizzas(List<Pizza> pizzas){
            this.pizzas = pizzas;
    }
    public void addPizza(Pizza pizza){

        pizzas.add(pizza);
    }
    public void deletePizza(Pizza pizza){
        pizzas.remove(pizza);
    }
    public void addCustomer(Customer cs){
        customers.add(cs);
    }
}
