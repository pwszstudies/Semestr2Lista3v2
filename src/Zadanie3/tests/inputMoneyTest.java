package Zadanie3.tests;

import Zadanie3.InputMoney;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class inputMoneyTest {
    InputMoney InputTest;

    @Before
    public void setUp() throws Exception {
        InputTest = new InputMoney();
    }

    @Test
    public void validateInputTest() throws Exception {
        assertFalse(InputTest.validateInput("25gr"));
        assertFalse(InputTest.validateInput("50"));
        assertTrue(InputTest.validateInput("1zl"));
        assertTrue(InputTest.validateInput("50gr"));
    }
}