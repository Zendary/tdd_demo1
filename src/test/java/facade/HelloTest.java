package facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testHello(){
        System.out.println("Method to say hello");
        String actual = hello.sayHello("Helge");
        String expected = "Hello Helge";
        assertEquals(expected, actual);
    }
    @Test
    public void testHelloNull(){
        System.out.println("Method to handle Null name");
        String actual = hello.sayHello(null);
        String expected = "Hello my friend";
        assertEquals(expected, actual);

    }

    @Test
    public void testAllCaps(){
        System.out.println("Method to handle all caps name");
        String actual = hello.sayHello("MARTIN");
        String expected = "HELLO MARTIN";
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoNamesInput(){
        System.out.println("Method to handle two name inputs");
        String actual = hello.sayHello2(new String[]{"Martin", "Berry"});
        String expected = "Hello, Martin, and Berry.";
        assertEquals(expected, actual);
    }

    @Test
    public void testUndefinedNumberOfNames(){
        System.out.println("Method to handle any number of names");
        String actual = hello.sayHello2(new String[]{"Martin", "Berry", "Malene"});
        String expected = "Hello, Martin, Berry, and Malene.";
        assertEquals(expected, actual);
    }

    {
//        @Test
//        public void testNamesWithAndWithoutCapsLock () {
//        System.out.println("Method to handle names with and without capslock");
//        String actual = hello.sayHello2(new String[]{"Martin", "BERRY", "Malene"});
//        String expected = "Hello, Martin, and Malene. AND HELLO BERRY";
//        assertEquals(expected, actual);
//    }
    }
}