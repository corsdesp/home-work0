package com.epam.training.app;

/**
 * Определяет, есть ли в массиве строк одинаковые элементы
 */
public class SameElementsUtils {
    public boolean findDuplicateElements(String[] strArray) {
        int secondRepeat = 2;
        for (String valueOfTheFirstCycle : strArray) {
            int countRepeat = 0;
            for (String valueSecondOfTheCycle : strArray) {
                if (valueOfTheFirstCycle.equals(valueSecondOfTheCycle)) {
                    countRepeat++;
                    if (countRepeat == secondRepeat) return true;
                }
            }
        }
        return false;
    }
}
