package lk.ijse.gdse68.springintro;

import lk.ijse.gdse68.springintro.beans.TestBean;
import lk.ijse.gdse68.springintro.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();
        TestBean test = (TestBean)ctx.getBean("test");
        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        boolean isSingletonTest = beanFactory.isSingleton("test");
        System.out.println(test);
        System.out.println("Is test singleton: "+isSingletonTest);
        ctx.registerShutdownHook();
    }
}