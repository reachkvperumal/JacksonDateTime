package com.kv.demo;

import com.kv.demo.controller.AccountDetails;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = AccountDetails.class)
class DemoDateTimeApplicationTests {

	@Test
	void contextLoads() {
    assertTrue(Boolean.TRUE);
  }

}
