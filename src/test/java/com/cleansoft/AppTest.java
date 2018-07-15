package com.cleansoft;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class AppTest {

    @Test
    public void sayHello() {
        App app = new App();
        assertNotNull(app.sayHello());
    }
}
