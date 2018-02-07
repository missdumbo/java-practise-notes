package missdumbo.codebase.frw.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		User student = (User) context.getBean("user");
		student.getName();
		student.getAge();
		student.printThrowException();
	}
}
