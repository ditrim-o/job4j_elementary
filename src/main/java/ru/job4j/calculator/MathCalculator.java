package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndSubtraction(double first, double second) {
        return div(first, second) + subtraction(first, second);

    }

    public static double allOperationsSum(double first, double second) {
        return div(first, second) + subtraction(first, second) + sum(first, second) + multiply(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
    }
}
