package Calculations;

import org.springframework.stereotype.Component;

@Component
public interface TaxCalculation {
    double formula(double yearlyIncome);
}
