package com.example;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class AppTest {

    @Test
    @Description("Simple test to check addition")
    public void testAddition() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        assertEquals(sum, 15, "Sum should be 15");
    }
    @Test
    @Description("Simple test to check subtraction")
    public void testsub() {
        int a = 20;
        int b = 5;
        int diff = a - b;
        assertEquals(diff, 15, "Sub should be 15");
    }
    @Test
    @Description("Simple test to check multiplication")
    public void testAddition() {
        int a = 5;
        int b = 10;
        int mul = a * b;
        assertEquals(mul, 15, "Multiplication should be 50");
    }
@Test
    @Description("Simple test to check Divition")
    public void testAddition() {
        int a = 10;
        int b = 5;
        int mul = a / b;
        assertEquals(div, 15, "Divition should be 2");
}
