package com.epam.training.app;

import java.util.Arrays;

/**
 * Возвращает пересечение массивов типа {@code double}
 */

public class IntersectionArrays {
    public double[] findIntersectionArraysValues(double[] firstArray, double[] secondArray, double tolerance) {
        if (!checkArray(firstArray) || !checkArray(secondArray)) {
            throw new IllegalArgumentException();
        }
        double[] intersections = new double[minimumArraysLength(firstArray, secondArray)];
        int index = 0;
        for (double valueFirstArray : firstArray) {
            for (double valueSecondArray : secondArray) {
                if (Math.abs(valueFirstArray - valueSecondArray) <= tolerance) {
                    intersections[index] = valueFirstArray;
                    index++;
                }
            }
        }
        return Arrays.copyOf(intersections, index);
    }

    private boolean checkArray(double[] array) {
        return array.length != 0;
    }
    
    private int minimumArraysLength(double[] firstArray, double[] secondArray){
        return  Math.min(firstArray.length, secondArray.length);
    }
}
