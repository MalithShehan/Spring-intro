//package lk.ijse.gdse68.springintro.beans;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.*;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
//@Component
//public class TestBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
//
//    @Override
//    public void setBeanName(String name) {
//        System.out.println("Bean name is"+name);
//    }
//
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("Bean Factory is"+beanFactory);
//    }
//
//    @Override
//    public void destroy() throws Exception {
//
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println();
//    }
//}
//
