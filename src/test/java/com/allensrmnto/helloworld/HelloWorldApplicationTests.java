package com.allensrmnto.helloworld;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.allensrmnto.helloworld.hello.HelloController;

@SpringBootTest
class HelloWorldApplicationTests {
	@Autowired
	HelloController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
