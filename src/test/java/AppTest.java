import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting",
                classUnderTest.getGreeting());
    }

    @Test
    public void testAppGreetingIsCorrect() {
        App classUnderTest = new App();
        assertEquals("app greeting is not correct", "Hello world.",
                classUnderTest.getGreeting());
    }

}