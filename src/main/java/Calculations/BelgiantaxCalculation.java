package Calculations;

import org.springframework.stereotype.Component;

@Component
public class BelgiantaxCalculation implements TaxCalculation {
    public double formula(double yearlyIncome) {
        return yearlyIncome * 0.45;
    }
}
