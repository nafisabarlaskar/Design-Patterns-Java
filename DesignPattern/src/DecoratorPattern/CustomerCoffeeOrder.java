package DecoratorPattern;

/**
 * Created by NafisaBarlaskar on 03-01-2017.
 */

import java.io.*;

public class CustomerCoffeeOrder {

    private static int orderNumber;

    public static void main(String args[]) {

        for (int numberOfOrders = 0; numberOfOrders < 3; numberOfOrders++) {
            System.out.print("========= Coffee Menu ============ \n");
            System.out.print("            1. Simple Coffee.   \n");
            System.out.print("            2. Coffee with milk.\n");
            System.out.print("            3. Coffee with Chocolate       \n");
            System.out.print("            4. Exit                        \n");
            System.out.print("Enter your choice: ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                orderNumber = Integer.parseInt(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (orderNumber) {

                case 1:
                    SimpleCoffee simpleCoffee = new SimpleCoffee();
                    System.out.println("Coffee type: " + simpleCoffee.getDescription());
                    System.out.println("Price: " + simpleCoffee.getPrice());
                    break;

                case 2:
                    Coffee coffeeWithMilk = new MilkDecorator((Coffee) new SimpleCoffee());
                    System.out.println("Coffee Type: " + coffeeWithMilk.getDescription());
                    System.out.println("Price: " + coffeeWithMilk.getPrice());
                    break;

                case 3:
                    Coffee coffeeWithChocolate = new ChocolateDecorator((Coffee) new SimpleCoffee());
                    System.out.println("Coffee Type: " + coffeeWithChocolate.getDescription());
                    System.out.println("Price: " + coffeeWithChocolate.getPrice());
                    break;

                default:
                    System.out.println("No other coffee is available!!");
                    return;

            }
        }
    }
}
