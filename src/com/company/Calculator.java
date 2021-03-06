package com.company;

public class Calculator {

    public double number1, number2;

    public Calculator(double num1, double num2)
    {
        number1 = num1;
        number2 = num2;
    }

    public double addition()
    {
        return number1+number2;
    }

    public double subtraction()
    {
        return number1-number2;
    }

    public double multiplication()
    {
        return number1*number2;
    }

    public double division()
    {
        return number1/number2;
    }

    public double power()
    {
        return Math.pow(number1,number2);
    }
}
