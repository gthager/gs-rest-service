package com.example.restservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoApplicationTests {
	
	@Test
	void contextLoads() {
		
	}
	
	@Test
	void testGetContent() {
		Greeting greeting = new Greeting(1, "test");
		assertEquals("test", greeting.getContent());
	}
}
