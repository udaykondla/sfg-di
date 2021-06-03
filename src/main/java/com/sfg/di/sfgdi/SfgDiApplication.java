package com.sfg.di.sfgdi;

import com.sfg.di.sfgdi.config.SfgConfiguration;
import com.sfg.di.sfgdi.controllers.ConstructorInjectedController;
import com.sfg.di.sfgdi.controllers.I18nController;
import com.sfg.di.sfgdi.controllers.MyController;
import com.sfg.di.sfgdi.controllers.PropertyInjectedController;
import com.sfg.di.sfgdi.controllers.SetterInjectedController;

import com.sfg.di.sfgdi.datasource.FakeDataSource;
import com.sfg.di.sfgdi.services.PrototypeBean;
import com.sfg.di.sfgdi.services.SingletonBean;
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

		System.out.println("------------scopes--------------");
		SingletonBean singletonBean1 = (SingletonBean) ctx.getBean("singletonBean");
		SingletonBean singletonBean2 = (SingletonBean) ctx.getBean("singletonBean");

		System.out.println(singletonBean1.getMyScope());
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = (PrototypeBean) ctx.getBean("prototypeBean");
		PrototypeBean prototypeBean2 = (PrototypeBean) ctx.getBean("prototypeBean");

		System.out.println(prototypeBean1.getScope());
		System.out.println(prototypeBean2.getScope());

		FakeDataSource fds = (FakeDataSource) ctx.getBean("fakeDataSource");
		System.out.println(fds.getUsername());
		System.out.println(fds.getPassword());
		System.out.println(fds.getJdbcurl());

		System.out.println("-----------config props bean------------");
		SfgConfiguration sfgConfiguration = (SfgConfiguration) ctx.getBean("sfgConfiguration");
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcUrl());
	}



}
