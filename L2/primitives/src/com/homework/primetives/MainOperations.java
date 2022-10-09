
/*
        2.
        Создать проект , имя operations
        В методы main создать все численные переменные
        Инициализировать их начальными значениями
        Провести математические операции над ними ( не только с одниковыми , но и например int + long и тд )
        Создать переменные под результаты операций
        Результаты вывести в консоль
        2.>
        Повторить задание 2 , но все математические операции выполнять в отделных , разных методах .
*/

package com.homework.primetives;

public class MainOperations {
    public static void main(String[] args) {
        long longValue = 50;
        int intValue = 29;
        byte byteValue = 89;
        short shortValue = 130;
        float floatValue = 180.98f;
        double doubleValue = 348.98;

        int result1 = byteValue + shortValue;
        long result2 = longValue + intValue;
        double result3 = floatValue + doubleValue;
        double result4 = intValue + doubleValue;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("-------------");
        sumOfByteAndShort(byteValue, shortValue);
        sumOfFloatAndDouble(floatValue, doubleValue);
        sumOfIntAndDouble(intValue, doubleValue);
        sumOfIntAndLong(intValue, longValue);
    }

    public static void sumOfIntAndDouble(int intValue, double doubleValue) {
        System.out.println(intValue + doubleValue);
    }

    public static void sumOfFloatAndDouble(float floatValue, double doubleValue) {
        System.out.println(floatValue + doubleValue);
    }
    public static void sumOfByteAndShort(byte byteValue, short shortValue) {
        System.out.println(byteValue + shortValue);
    }

    public static void sumOfIntAndLong(int intValue, long longValue) {
        System.out.println(intValue + longValue);
    }
}




