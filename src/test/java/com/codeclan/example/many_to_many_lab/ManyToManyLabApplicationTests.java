
package com.codeclan.example.many_to_many_lab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManyToManyLabApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Employee employee = new Employee("test", 30, "123456A");
		employeeRepository.save(employee);
	}
}
