package DecoratorPattern;

/**
 * Created by NafisaBarlaskar on 03-01-2017.
 */
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
