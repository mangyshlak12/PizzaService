public class PizzaBase {
    String description;
    String baseType;
    String baseName;
    public PizzaBase(String baseName,String baseType,String description){
        this.baseName = baseName;
        this.baseType = baseType;
        this.description = description;
    }
    @Override
    public String toString(){
        return "baseName: " + baseName + ", " + "baseType: " +  baseType + ", " + "description: " + description;

    }
    public static void main(String[] args){

    }

}
