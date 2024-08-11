package lk.ijse.gdse68.springintro.config;

import lk.ijse.gdse68.springintro.beans.Customer;
import lk.ijse.gdse68.springintro.beans.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Customer.class} )
public class Config {
    @Bean
    public Order order(){
        return new Order();
    }

}
