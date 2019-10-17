package Calculations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class SpringRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext apiContent =
                new AnnotationConfigApplicationContext(Config.class);

        TaxCalculator myCalculator = apiContent.getBean(TaxCalculator.class);

        myCalculator.setTaxCalculation(apiContent.getBean("getFrench",TaxCalculation.class));

        System.out.println("French : " + myCalculator.getTaxCalculation().formula(45));

        myCalculator.setTaxCalculation(apiContent.getBean("getBelgian",TaxCalculation.class));

        System.out.println("Belgian : " + myCalculator.getTaxCalculation().formula(45));

        myCalculator.setTaxCalculation(apiContent.getBean("getAmerican",TaxCalculation.class));

        System.out.println("American : "+ myCalculator.getTaxCalculation().formula(45));

    }
}
