package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int calculater = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                calculater = calculater + 1;

            } else {
                money = money + income;
                money = money - expenses;

            }
        }
        return calculater;
    }
}
