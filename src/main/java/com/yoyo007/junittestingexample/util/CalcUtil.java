package com.yoyo007.junittestingexample.util;

import static java.lang.Math.sqrt;

public class CalcUtil {

    public static double calculateTriangleLastSideLength(int sideA, int sideB) {
        if (sideA < 0 || sideB < 0) {
            throw new ArithmeticException("value cannot be negative");
        }  else {
            double cSideSquared = sideA * sideA + sideB * sideB;
            return sqrt(cSideSquared);
        }
    }

}
