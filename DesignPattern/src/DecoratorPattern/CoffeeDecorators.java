package DecoratorPattern;

/**
 * Created by NafisaBarlaskar on 03-01-2017.
 */
public abstract class CoffeeDecorators implements Coffee {

    private Coffee coffee;

    public CoffeeDecorators(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public int getPrice() {
        return coffee.getPrice();
    }
}
