package com.zun.basics;

import com.zun.basics.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CDI {

	private static Logger LOGGER = LoggerFactory.getLogger(CDI.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CDI.class, args);

		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

		LOGGER.info("{}", someCDIBusiness);
		LOGGER.info("{}", someCDIBusiness.getSomeCDIDao());
	}

}
