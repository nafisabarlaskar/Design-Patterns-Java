package FactoryPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class PlanFactory {

    public Plan getPlan(int planNumber){

        if(planNumber == 0){
            System.out.println("No plan selected!");
        }

       switch (planNumber){
           case 1:
               return new DomesticPlan();
           case 2:
               return new InternationalPlan();
           case 3:
               return new StudentPlan();
       }

       return null;
    }
}
