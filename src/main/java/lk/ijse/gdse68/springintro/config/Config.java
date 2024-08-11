package lk.ijse.gdse68.springintro.config;


import lk.ijse.gdse68.springintro.beans.Order;
import lk.ijse.gdse68.springintro.beans.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {TestBean.class} )
public class Config {
    @Bean
    public Order order(){
        return new Order();
    }

}
