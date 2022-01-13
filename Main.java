package com.company;

import java.util.Scanner;

public class Main {
    static final String[] UNITS = new String[] {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять",
            "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать",
            "восемнадцать", "девятнадцать"};
    static final String[] DOZENS = new String[]{"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
            "восемьдесят", "девяносто"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input age: ");
        int age = input.nextInt();
        System.out.println(calculateAge(age));
    }

    static String calculateAge(int age){
        StringBuilder stringBuilder = new StringBuilder();
        if (age > 19){
            stringBuilder.append(DOZENS[age / 10]);
            if (age % 10 > 0){
                stringBuilder.append(" ").append(UNITS[age % 10]);
                stringBuilder.append(makeFormOfWord(age % 10));
            }
            if (age % 10 == 0){
                stringBuilder.append(makeFormOfWord(age));
            }
        }
        else {
            stringBuilder.append(UNITS[age]);
            stringBuilder.append(makeFormOfWord(age));
        }
        return firstLetterToUpperCase(stringBuilder.toString());
    }

    static String makeFormOfWord(int age){
        if (age > 4){
            return " лет";
        }
        else if (age > 1){
            return " года";
        }
        else if (age == 1){
            return " год";
        }
        return "";
    }

    static String firstLetterToUpperCase(String str){
        if (str == null || str.equals("")) {
            return "";
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
