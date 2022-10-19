package com.example.calculatorhomeworktests.service;

import com.example.calculatorhomeworktests.exeption.DivisionByZeroException;

public interface CalculatorService {
    public int plus( int a, int b);
    public int minus( int a, int b);
    public int multiply( int a, int b);
    public int divide(int a, int b) throws DivisionByZeroException;


}
