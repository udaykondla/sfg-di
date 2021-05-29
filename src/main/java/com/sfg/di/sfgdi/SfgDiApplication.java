package com.sfg.di.sfgdi;

import com.sfg.di.sfgdi.controllers.ConstructorInjectedController;
import com.sfg.di.sfgdi.controllers.I18nController;
import com.sfg.di.sfgdi.controllers.MyController;
import com.sfg.di.sfgdi.controllers.PropertyInjectedController;
import com.sfg.di.sfgdi.controllers.SetterInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		//String a = myController.sayHello();
		System.out.println("------primary----------");
		System.out.println(myController.sayHello());


		System.out.println("----property-----");

		PropertyInjectedController pctlr = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(pctlr.getGreeting());


		System.out.println("====setter----");
		SetterInjectedController sctlr = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(sctlr.getGreeting());

		System.out.println("---constructor----");
		ConstructorInjectedController cctlr = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(cctlr.getGreeting());



		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());
	}



}
