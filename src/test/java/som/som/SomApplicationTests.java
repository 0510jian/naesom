package som.som;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SomApplicationTests {

	@Autowired
	private som.som.Service.factoryService factoryService;

	@Test
	void contextLoads() {
	}
}
