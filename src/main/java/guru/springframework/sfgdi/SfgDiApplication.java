package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

	  ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		System.out.println(((MyController) context.getBean("myController")).getMessage() );
	}

}
