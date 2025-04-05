package main.java.com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnvironmentServiceTest {
    @Test
    public void testDevelopmentEnvironment() {
        EnvironmentService service = new EnvironmentService("development");
        assertTrue(service.isEnvironmentValid());
        assertEquals("Welcome to Development Environment", service.getEnvironmentMessage());
    }

    @Test
    public void testTestEnvironment() {
        EnvironmentService service = new EnvironmentService("test");
        assertTrue(service.isEnvironmentValid());
        assertEquals("Welcome to Test Environment", service.getEnvironmentMessage());
    }

    @Test
    public void testAcceptanceEnvironment() {
        EnvironmentService service = new EnvironmentService("acceptance");
        assertTrue(service.isEnvironmentValid());
        assertEquals("Welcome to Acceptance Environment", service.getEnvironmentMessage());
    }

    @Test
    public void testProductionEnvironment() {
        EnvironmentService service = new EnvironmentService("production");
        assertTrue(service.isEnvironmentValid());
        assertEquals("Welcome to Production Environment", service.getEnvironmentMessage());
    }

    @Test
    public void testInvalidEnvironment() {
        EnvironmentService service = new EnvironmentService("staging");
        assertFalse(service.isEnvironmentValid());
        assertEquals("Unknown Environment", service.getEnvironmentMessage());
    }

//    @Test
//    public void testNullEnvironment() {
//        EnvironmentService service = new EnvironmentService(null);
//        assertFalse(service.isEnvironmentValid());
//        assertEquals("Unknown Environment", service.getEnvironmentMessage());
//    }
}