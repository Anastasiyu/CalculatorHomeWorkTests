package com.example.calculatorhomeworktests.controller;


import com.example.calculatorhomeworktests.exeption.DivisionByZeroException;
import com.example.calculatorhomeworktests.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping()
    public String hello() {
        return "Привет! Ты вкалькуляторе!";
    }


    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1") int a,
                       @RequestParam(name = "num2") int b) {
        return buildResult(a,b, "+", calculatorService.plus(a,b));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1") int a,
                        @RequestParam(name = "num2") int b) {
        return buildResult(a,b, "-", calculatorService.minus(a,b));

    }

    @GetMapping("r/multiply")
    public String multiply(@RequestParam(name = "num1") int a,
                           @RequestParam(name = "num2") int b) {
        return buildResult(a,b, "*", calculatorService.multiply(a,b));

    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1", required = false) int a,
                         @RequestParam(name = "num2", required = false) int b) {

            return buildResult(a,b, "/", calculatorService.divide(a,b));

        }

    private String buildResult(int a, int b, String operation, int result){
        return  String.format("%d %s %d = %d", a, operation, b, result);
    }
}


