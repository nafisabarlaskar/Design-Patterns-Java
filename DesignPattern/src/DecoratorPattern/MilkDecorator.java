package DecoratorPattern;

/**
 * Created by NafisaBarlaskar on 03-01-2017.
 */
public class MilkDecorator extends CoffeeDecorators{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", with Milk";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+ 100;
    }
}