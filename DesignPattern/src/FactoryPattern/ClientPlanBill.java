package FactoryPattern;

import java.util.Scanner;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class ClientPlanBill {

    public static void main(String args[]){

        PlanFactory planFactory = new PlanFactory();
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your plan number:");
        System.out.println("For Domestic plans, type 1");
        System.out.println("For International plans, type 2");
        System.out.println("For Student plans, type 3");

        Scanner input = new Scanner(System.in);

        int planNumber = input.nextInt();

        System.out.println("Enter the units that you have consumed:");

        int units = input.nextInt();

        Plan plan = planFactory.getPlan(planNumber);

        System.out.println("Bill is Rs." + plan.calculateBill(units, plan.getRate()));





    }
}
