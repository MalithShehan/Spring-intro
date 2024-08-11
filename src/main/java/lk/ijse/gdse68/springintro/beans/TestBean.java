package lk.ijse.gdse68.springintro.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("test")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestBean implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, InitializingBean, DisposableBean {
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is "+name);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory is "+beanFactory);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("man yanooooooo");
    }
    @PreDestroy
    public void customDestroyTest(){
        System.out.println("man yanooooooo with custom destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext is "+applicationContext);
    }
}

