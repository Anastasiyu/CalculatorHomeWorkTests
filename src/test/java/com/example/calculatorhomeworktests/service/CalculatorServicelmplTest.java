package com.example.calculatorhomeworktests.service;

import com.example.calculatorhomeworktests.exeption.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.websocket.OnError;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServicelmplTest {
    private final CalculatorService calculatorService = new CalculatorServicelmpl();

    @Test
    public void sholdReternTwoThenSumAndOne() {
        int result = calculatorService.plus(Constants.ONE, Constants.ONE);
        assertEquals(Constants.ONE + Constants.ONE, result);

    }

    @Test
    public void sholdReternThreeThenSumAndOne() {
        int result = calculatorService.plus(Constants.TWO, Constants.ONE);
        assertEquals(Constants.TWO + Constants.ONE, result);

    }

    @Test
    public void sholdReternOneThenMinusAndOne() {
        int result = calculatorService.minus(Constants.TWO, Constants.ONE);
        assertEquals(Constants.TWO - Constants.ONE, result);
    }

    @Test
    public void sholdReternTooThenMinusAndOne() {
        int result = calculatorService.minus(Constants.THREE, Constants.ONE);
        assertEquals(Constants.THREE - Constants.ONE, result);
    }

    @Test
    public void sholdReternForThenMultiplyAndOne() {
        int result = calculatorService.multiply(Constants.TWO, Constants.TWO);
        assertEquals(Constants.TWO * Constants.TWO, result);
    }

    @Test
    public void sholdReternOneThenMultiplyAndOne() {
        int result = calculatorService.multiply(Constants.ONE, Constants.ONE);
        assertEquals(Constants.ONE * Constants.ONE, result);

    }

    @Test
    public void sholdReternForThenDivideAndOne() throws DivisionByZeroException {
        int result = calculatorService.divide(Constants.FOR, Constants.ONE);
        assertEquals(Constants.FOR * Constants.ONE, result);
    }

    @Test
    public void sholdReternTwoThenDivideAndOne() throws DivisionByZeroException {
        int result =  calculatorService.divide(Constants.FOR, Constants.TWO);

        assertEquals(Constants.FOR / Constants.TWO, result);
    }
   // @Test
   // public void souldTrowDivisionByZeroExceptionDivideByZero(){
   //  /   assertThrows(DivisionByZeroException.class, () calculatorService.divide(Constants.ONE, Constants.ZERO ));
   // }
}