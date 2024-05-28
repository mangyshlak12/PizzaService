public class Topping {
    String description;
    String spiceLevel;
    String toppingName;

    public Topping(String toppingName,String spiceLevel,String description){
        this.toppingName = toppingName;
        this.spiceLevel = spiceLevel;
        this.description = description;
    }
    @Override
    public String toString(){
        return "toppingName: " + toppingName + ", " + "spiceLevel: " +  spiceLevel + ", " + "description: " + description;
    }
    public static void main(String[] args){

    }

}
