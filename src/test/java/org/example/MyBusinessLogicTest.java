package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBusinessLogicTest {

    private MyBusinessLogic myBusinessLogic;

    @Before
    public void init() {
        myBusinessLogic = new MyBusinessLogic();
    }

    @Test
    public void businessProcess() {
        String albert = myBusinessLogic.businessProcess("Albert");
        Assert.assertNotNull(albert);
        Assert.assertEquals("Albert", albert);
    }
}