package Calculations;

import org.springframework.stereotype.Component;

@Component
public class FrenchTaxCalculation implements TaxCalculation {
    public double formula(double yearlyIncome) {
        return yearlyIncome * 0.48;
    }
}
