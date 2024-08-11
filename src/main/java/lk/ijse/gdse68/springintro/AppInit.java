package lk.ijse.gdse68.springintro;

import lk.ijse.gdse68.springintro.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        var isSingletonCustomer = beanFactory.isSingleton("customer");
        System.out.println("Is Customer Singleton "+ isSingletonCustomer);
        ctx.registerShutdownHook();
    }
}
