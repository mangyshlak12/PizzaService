import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static PizzaStore ps = new PizzaStore();
    static PizzaService pservice = new PizzaService(ps);

    public static void main(String[] args) {
        firstMenu();

    }
    public static void firstMenu(){
        try{
            boolean k = true;
           while(k){
                System.out.println("1. Admin console");
                System.out.println("2. Customer console");
                System.out.println("3. Exit");
                System.out.print("Choose: ");
                int n = scan.nextInt();
                switch(n){
                    case 1 :
                        adminConsole();
                        break;
                    case 2:
                        customerConsole();
                        break;
                    case 3:
                        k = false;
                        break;
                    default:
                        System.out.println("Does'n exist");
                        firstMenu();
                }

            }


        }catch(Exception e){
            System.out.println("Input is wrong");
        }
    }
    public static void adminConsole(){
        try{
            boolean k = true;
            while(k){
                System.out.println("1. Add New Pizza");
                System.out.println("2. Update Price");
                System.out.println("3. Delete Pizza");
                System.out.println("4. View All Pizza");
                System.out.println("5. Search Pizza");
                System.out.println("6. Exit");
                System.out.print("Choose: ");
                int n = scan.nextInt();
                switch(n){
                    case 1:
                        addPizza();
                        break;
                    case 2:
                        updatePrice();
                        break;
                    case 3:
                        deletePizza();
                        break;
                    case 4:
                        viewAllPizza();
                        break;
                    case 5:
                        searchPizza();
                        break;
                    case 6:
                        k = false;
                        break;
                    default:
                        System.out.println("Invalid Number");
                        adminConsole();
                }
            }
        }catch(Exception e){
            System.out.println("Wrong Input");
        }



    }
    public static void addPizza(){
        try{
            System.out.println();
            System.out.println("Add New Pizza to Menu");
            System.out.println();
            System.out.println("Enter Details as name of Topping, spice level(basic/mediate/full), description to add a new Topping");
            String topping = scan.next();
            String[] array = topping.split(",");
            Topping tp = new Topping(array[0],array[1],array[2]);

            System.out.println("Enter Details as name of Base, type(thin/thick), description to add a new PizzaBase");

            String base = scan.next();
            String[] array1 = base.split(",");
            PizzaBase pb = new PizzaBase(array1[0],array1[1],array1[2]);
            System.out.println("Enter Details as name of Pizza, price, size(small/medimum,large) to add a new Pizza");
            String pizza = scan.next();
            String[] array2 = pizza.split(",");
            int count = 1;
            Pizza pz = new Pizza(count,array2[0],Double.parseDouble(array2[1]),array2[2],tp,pb);
            System.out.println("New Pizza Added Successfully !!!");
            System.out.println();
            System.out.println(pz.toString());
            System.out.println();

            ps.addPizza(pz);
            count++;


        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
    public static void updatePrice(){
        try{

            System.out.println("Update Price Menu");
            System.out.println();
            System.out.println("Enter name of Pizza");
            String s = scan.next();
            boolean updated = false;
            for(Pizza i : ps.getPizzas()){
                if(s.equals(i.getName())){
                    System.out.println("Add new Price:");
                    String newp = scan.next();
                    pservice.updatePrice(i,Double.parseDouble(newp));
                    System.out.println();
                    System.out.println(i);
                    updated = true;
                    break;
                }
            }
            System.out.println();
            if(updated){
                System.out.println("Updated Succesfully");
            }else{
                System.out.println("Not Updated");
            }
            System.out.println();
        }catch(Exception e){
            System.out.println("Wrong");
        }



    }
    public static void deletePizza(){
            System.out.println();
            System.out.println("Delete Pizza Menu");
            System.out.println();
            System.out.println("Enter Pizza name");
            String name = scan.next();
            boolean deleted = false;

             for(Pizza i : ps.getPizzas()){
                 if(name.equals(i.getName())){
                    ps.deletePizza(i);
                    deleted = true;
                    break;
                 }
            }
                 System.out.println();
             if(deleted){
                 System.out.println("Deleted Successfullly");
             }else{
                 System.out.println("Something is wrong");
             }


    }
    public static void viewAllPizza(){
        int n =1 ;
        System.out.println();
        System.out.println("View All Pizza Menu");
        for(Pizza i : ps.getPizzas()){
            System.out.println();
            System.out.println("Pizza Number " + n);
            System.out.println(i);
            n++;
        }
        System.out.println();
    }
    public static void searchPizza(){
        System.out.println("");
        System.out.println("1.Search Pizza Menu");
        System.out.println("");
        System.out.println("Input Name");
        String name = scan.next();
        boolean isExist = false;
        for(Pizza i : ps.getPizzas()){
            if(name.equals(i.getName())){
                System.out.println("");
                System.out.println(i);
                System.out.println("");

                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("");
            System.out.println("No Exist");
        }


    }


    public static void customerConsole(){
        try{
            System.out.println("Welcome to CUSTOMER console");
            System.out.println();
            System.out.println("Enter your doorNumber, street, city, district, state");
            String a = scan.next();
            String[] array = a.split(",");
            Address ad = new Address(Integer.parseInt(array[0]),array[1],array[2],array[3],array[4]);
            System.out.println("Enter your Details as name, email, mobile");
            String b = scan.next();
            String[] array1 = b.split(",");
            int count =1 ;
            Customer cs = new Customer(count,array1[0],array1[1],Long.parseLong(array1[2]),ad);
            ps.addCustomer(cs);
            System.out.println("Customer Added");
            System.out.println(cs);
            customerMenu(cs);

        }catch(Exception e){
            System.out.println("Invalid");
        }

    }
    public static void customerMenu(Customer cs){
        try{
            boolean k = true;
            while(k){
                System.out.println("1. Order Pizza");
                System.out.println("2. Pay Bill");
                System.out.println("3. View All Pizza");
                System.out.println("4. View Your Orders");
                System.out.println("5. Search Pizza");
                System.out.println("6. Exit");
                System.out.print("Choose: ");
                int n = scan.nextInt();
                switch(n){
                    case 1:
                        orderPizza(cs);
                        break;
                    case 2:
                        payBill(cs);
                        break;
                    case 3:
                        viewAllPizza();
                        break;
                    case 4:
                       viewYourOrders();
                        break;
                    case 5:
                        searchPizza();
                        break;
                    case 6:
                        k = false;
                        break;
                    default:
                        System.out.println("Invalid Number");
                        adminConsole();
                }
            }
        }catch(Exception e){
            System.out.println("Wrong Input");
        }
    }
    public static void orderPizza(Customer cs){
        System.out.println("");
        System.out.println("Order Pizza Menu");
        System.out.println("");
        System.out.println("Avaible Pizzas: ");
        for(Pizza i : ps.getPizzas()){
                System.out.println(i);
        }
        System.out.println("");
        System.out.println("Enter Pizza Name to Place your order");
        String name = scan.next();
        for(Pizza i : ps.getPizzas()){
            if(name.equals(i.getName())){
                System.out.println("");
                Order ord = new Order(1,"asdasd",i.getPrice(),"no");
                cs.addOrder(ord);
                System.out.println("Your order succesfully placed");
                System.out.println("");
                System.out.println(i);
                break;
            }
        }

    }
    public static void payBill(Customer cs){
        System.out.println("To pay: "+       cs.billAmount());
    }
    public static void viewYourOrders(){

    }
}