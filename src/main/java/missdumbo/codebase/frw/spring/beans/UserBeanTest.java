package missdumbo.codebase.frw.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserBeanTest {
	public static void main(String[] args) {
		System.out.println("Spring Bean Creation Process");
		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
        
        System.out.println("xml load success");
        UserBean person1 = (UserBean) ac.getBean("person1");
        System.out.println(person1);        
        ((ClassPathXmlApplicationContext)ac).close();
	}
}
