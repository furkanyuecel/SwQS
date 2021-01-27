package com.mycompany.app.exercise3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calc;

    @Before
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calc.addition(3, 2));
    }

    @Test
    public void testNegativeAddition() {
        assertEquals(2, calc.addition(-1, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, calc.subtraction(2, 2));
    }

    @Test
    public void testNegativeSubtraction() {
        assertEquals(0, calc.subtraction(-3, -3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(9, calc.multiplication(3, 3));
    }

    @Test
    public void testNegativeMultiplication() {
        assertEquals(-4, calc.multiplication(2, -2));
    }

    @Test
    public void testDivision() {
        assertEquals(5, calc.division(25, 5));
    }

    @Test
    public void testNegativeDivision() {
        assertEquals(-5, calc.division(-25, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void zeroDivision() {
        calc.division(3, 0);
    }

    @After
    public void teardown() {
        calc = null;
    }

}
