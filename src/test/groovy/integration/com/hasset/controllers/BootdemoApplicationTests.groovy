package com.hasset.controllers

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import unit.hasset.BootdemoApplication

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = BootdemoApplication)
@WebAppConfiguration
class BootdemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
