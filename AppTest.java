package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testTransmission() throws Exception {
        App app = new App();
        // Use a high port number to avoid system conflicts
        assertNotNull(app.transmit("Test Message", 9999));
    }
}
