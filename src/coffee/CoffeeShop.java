package coffee;

public class CoffeeShop {

    private String name;



    public CoffeeShop(String name) {
        this.name = name;
    }



    public Coffee makeCoffee(String name, boolean isIce) {
        return new Coffee(name, isIce);
    }
}
