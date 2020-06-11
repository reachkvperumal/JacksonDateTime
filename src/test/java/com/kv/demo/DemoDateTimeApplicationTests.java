package com.kv.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.kv.demo.controller.AccountDetails;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = AccountDetails.class)
class DemoDateTimeApplicationTests {

	@Test
	void contextLoads() {
    assertTrue(Boolean.TRUE);
  }

}
