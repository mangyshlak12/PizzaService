public class Pizza {
    PizzaBase pizzaBase;
    Topping topping;
    String size;
    private double price;
    private String pizzaName;
    int pizzaId;
    public Pizza(int pizzaId,String pizzaName,double price, String size,Topping topping, PizzaBase pizzaBase){
        this.pizzaId = pizzaId;
        this.pizzaName = pizzaName;
        this.price = price;
        this.size = size;
        this.topping = topping;
        this.pizzaBase = pizzaBase;
    }
    @Override
    public String toString(){
        return "Pizza Details => pizzaID: " +  pizzaId + ", " + "pizzaName: " + pizzaName + ", " + "price: " + price + ", size: " + size + "\nTopping Details => " + topping.toString() + "\nPizza Base Details => " + pizzaBase.toString();
    }
    public String getName(){
        return pizzaName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public static void main(String[] args){
    Pizza pz = new Pizza(1,"Margarita",45.5, "25",new Topping("1","1.0","basic"),new PizzaBase("b","b","b"));
    System.out.println(pz.toString());
    }
}
