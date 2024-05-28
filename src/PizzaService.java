public class PizzaService {
    String pizzaNotFoundMessage;
    PizzaStore ps;
    public PizzaService(PizzaStore ps){
        this.ps = ps;
    }

    void getPizzaBySize(String size){

    }
    void getPizzaById(int pizzaId){

    }
    void getPizzaByName(String pizzaName){

    }
    void orderNewPizza(){

    }
    void getAllPizzas(){

    }
    void updatePrice(Pizza pizza,double newPrice){
        pizza.setPrice(newPrice);
    }
    void deletePizza(Pizza pizza){

    }
    void addNewPizza(Pizza pizza){

    }
}
