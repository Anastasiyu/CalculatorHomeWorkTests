package com.example.calculatorhomeworktests.service;

import com.example.calculatorhomeworktests.exeption.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServicelmpl implements CalculatorService {
    @Override
    public int plus(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }
    @Override
    public int divide(int a, int b) throws DivisionByZeroException {
      if (b == 0) {
              throw new DivisionByZeroException();
    }
        return a / b;
    }
}

