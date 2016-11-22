package com.epam.training.app;

/**
 * Возвращает количество заданных символов в строке
 */

public class SymbolQuantity {
    public int findSymbolQuantity(String str, char symbol) {
        int count = 0;
        for (char strChar : str.toCharArray()) {
            if (symbol == strChar) {
                count++;
            }
        }
        return count;
    }
}
