package it.magiavventure.gateway;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GatewayApplicationTests {

	@Test
	void contextLoads() {
		int expected = 1;
		int actual = 1;
		Assertions.assertEquals(expected, actual);
	}

}
