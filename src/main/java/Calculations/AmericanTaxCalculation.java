package Calculations;

import org.springframework.stereotype.Component;

@Component
public class AmericanTaxCalculation implements TaxCalculation {

    public double formula(double yearlyIncome) {
        return yearlyIncome * 0.18 + 950;
    }
}
