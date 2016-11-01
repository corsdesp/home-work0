package com.epam.training.app;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        testQuantitySymbols();
        testFindDuplicates();
        testMatrixMultiplication();
        testIntersectionArrays();
    }

    private static void testQuantitySymbols() {
        SymbolQuantity symbolQuantity = new SymbolQuantity();
        int count = symbolQuantity.findSymbolQuantity("qwerrty", 'r');
        int testCount = 2;
        System.out.println(testCount == count);
    }

    private static void testFindDuplicates() {
        SameElementsUtils sameElementsUtils = new SameElementsUtils();
        String[] str = {"aa", "bb", "aa", "cc", "dd"};
        System.out.println(sameElementsUtils.findDuplicateElements(str));
    }

    private static void testMatrixMultiplication() {
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        int[][] firstMatrix = {
                {33, 34, 12},
                {33, 19, 10},
                {12, 14, 17},
                {84, 24, 51},
                {43, 71, 21}};
        int[][] secondMatrix = {
                {10, 11, 34, 55},
                {33, 45, 17, 81},
                {45, 63, 12, 16}};
        int[][] resultMatrix = {
                {1992, 2649, 1844, 4761},
                {1407, 1848, 1565, 3514},
                {1347, 1833, 850, 2066},
                {3927, 5217, 3876, 7380},
                {3718, 4991, 2921, 8452}};
        System.out.println(Arrays.deepEquals(
                resultMatrix, matrixMultiplication.getMatrixMultiplication(firstMatrix, secondMatrix)));
    }

    private static void testIntersectionArrays() {
        IntersectionArrays intersection = new IntersectionArrays();
        double tolerance = 0.0000001;
        double[] intersectionArray = intersection.findIntersectionArraysValues(
                new double[]{1.99, 2.23, 3.56, 4.03, 5.33}, new double[]{4.03, 5.33, 6.6, 7.12, 8.01}, tolerance);
        double[] testArray = new double[]{4.03, 5.33};
        System.out.println(Arrays.equals(intersectionArray, testArray));
    }
}
