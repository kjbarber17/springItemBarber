package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class StartProgram {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		
		ItemService itemService = applicationContext.getBean("itemService",ItemService.class);
		
		System.out.println("Item price before discount");
		System.out.println("Item 1 price: " +itemService.getItem(1).getPrice());
		System.out.println("Item 2 price: " +itemService.getItem(2).getPrice());
		
		itemService.changePrice(1,25);
		itemService.changePrice(2,50);
		
		System.out.println("Item price after discount");
		System.out.println("Item 1 price: " +itemService.getItem(1).getSalePrice());
		System.out.println("Item 2 price: " +itemService.getItem(2).getSalePrice());
		
		applicationContext.close();
	}
}	
		
		
