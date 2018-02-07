package com.kodilla.testing.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTestSuite {
    @Test
    public void testCaseCalculatorAdd() {
        //Given == Arrange
        int number = 30;
        //When == Act
        int addResult = Calculator.add(10, 20);
        //Then == Assert
        Assert.assertEquals(number, addResult);
    }

    @Test
    public void testCaseCalculatorSub() {
        //Given == Arrange
        int number = 20;
        //When == Act
        int subResult = Calculator.sub(25, 5);
        //Then == Assert
        Assert.assertEquals(number, subResult);
    }

}
