package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;

public class presAvecSpringAnnotation {
	public static void main(String[] agrs) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("dao","metier");
		
		IMetier metier = ctx.getBean(IMetier.class);
		System.out.println(metier.calcul());
		
	}

}