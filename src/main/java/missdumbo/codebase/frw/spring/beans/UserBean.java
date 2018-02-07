package missdumbo.codebase.frw.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class UserBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	private String name;
	
	public UserBean() {
		System.out.println("UserBean: constructor call");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("UserBean: set injection, name:" + name);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("UserBean: DisposableBean destroy call");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("UserBean： InitializingBean afterPropertiesSet call");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("UserBean: ApplicationContextAware setApplicationContext call");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("UserBean: BeanFactoryAware setBeanFactory call");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("UserBean: BeanNameAware setBeanName call, name:" + name);
	}
	
    public void myInit() {
        System.out.println("UserBean: myInit call");
    }
    
    public void myDestroy() {
        System.out.println("UserBean: myDestroy call");
    }
}
