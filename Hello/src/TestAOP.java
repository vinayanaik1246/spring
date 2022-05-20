import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.aop.ApplicationService;

public class TestAOP
{
	public static void main(String[] args) {
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("file.xml");
		
		ApplicationService annService=(ApplicationService)beanFactory.getBean(ApplicationService.class);
		System.out.println("annoService");
		annService.processApplication();
	}
	
}
