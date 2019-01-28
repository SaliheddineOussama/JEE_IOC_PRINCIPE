package presentation;

import metier.IMetier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationWithSpring {

	public static void main(String[] args) {

		// methode avec fichier config.xml
		// ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext springContext = new AnnotationConfigApplicationContext("dao","metier");
		
		// IMetier metier = (IMetier) springContext.getBean("metier");
		IMetier metier = (IMetier) springContext.getBean(IMetier.class);
		System.out.println(metier.calcul());
	}

}
