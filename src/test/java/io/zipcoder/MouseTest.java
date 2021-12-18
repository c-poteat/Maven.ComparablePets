package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MouseTest {

    @Test
    public void inheritanceTest() {
        Mouse mouse = new Mouse();
        Assert.assertTrue(mouse instanceof Pet);
    }
    @Test
    public void mouseSetName() {
        // Given
        Mouse mouse = new Mouse();
        String expected = "Jerry";

        //When
        mouse.setName(expected);
        String actual = mouse.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mouseSpeakTest() {
        // Given
        Mouse mouse = new Mouse();
        String actual = "Squeak";

        //Then
        Assert.assertEquals(actual,mouse.speak());
    }
}