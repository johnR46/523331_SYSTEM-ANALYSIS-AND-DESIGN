package comeng.sa.no12.demo;

import comeng.sa.no12.demo.entity.*;
import comeng.sa.no12.demo.repository.*;
import comeng.sa.no12.demo.controller.*;
import java.util.*;

import javax.persistence.criteria.Order;

import org.apache.tomcat.jni.Address;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.stream.Stream;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}

	@Bean
    CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);
        return filter;
	}

}


	

