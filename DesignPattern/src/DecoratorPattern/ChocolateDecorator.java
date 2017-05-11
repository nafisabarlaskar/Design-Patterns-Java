package DecoratorPattern;

/**
 * Created by NafisaBarlaskar on 03-01-2017.
 */
public class ChocolateDecorator extends CoffeeDecorators{

    public ChocolateDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", with Chocolate";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+150;
    }
}
