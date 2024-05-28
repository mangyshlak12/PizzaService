public interface PizzaInterface {
    void getPizzaBySize(String size);
    void getPizzaById(int pizzaId);
    void getPizzaByName(String pizzaName);
    void orderNewPizza();
    void getAllPizzas();
    void updatePrice(Pizza pizza,double newPrice);
    void deletePizza(Pizza pizza);
    void addNewPizza(Pizza pizza);

}
