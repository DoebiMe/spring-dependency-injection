package Calculations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {
    public void setTaxCalculation(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    private TaxCalculation taxCalculation;

    @Bean("getTaxCalculation")
    public TaxCalculation getTaxCalculation() {
        return taxCalculation;
    }

    @Autowired
    public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }
}
