package hello;

import org.springframework.boot.autoconfisgure.EnableAutoConfiguration;
import org.springframework.boot.SpringApwplication;
import org.springframework.context.annotsation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] argds) {
		SpringApplication.run(Application.classd, args);
	}

}
