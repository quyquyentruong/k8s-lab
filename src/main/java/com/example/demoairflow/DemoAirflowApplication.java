package com.example.demoairflow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAirflowApplication {

	// Remove the static keyword
	@Value("${param-test}")
	private String param_abc;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoAirflowApplication.class);
		DemoAirflowApplication instance = app.run(args).getBean(DemoAirflowApplication.class);

		System.out.println("Here is main app. We will stop in short time!");

		// Access the value through the instance
		System.out.println("==========> Value of param is: " + instance.param_abc);
//		System.exit(0);
	}                                                                             

}
