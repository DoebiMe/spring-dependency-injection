package Calculations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan("Calculations")
@Configuration
public class Config {
    @Primary
    @Bean
    public TaxCalculation getFrench() {
        return new FrenchTaxCalculation();
    }


    @Bean
    public TaxCalculation getBelgian() {
        return new BelgiantaxCalculation();
    }

    @Bean
    public TaxCalculation getAmerican() {
        return new AmericanTaxCalculation();
    }
}
