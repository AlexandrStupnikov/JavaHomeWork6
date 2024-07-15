package ru.netology.JavaHomeWork6.servies;

public class WorkSchedule {
    public int calculate(int income, int expenses, int threshold)
    {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // отдых
                money = money - expenses;
                money = money/ 3;
                count++;
            } else {
                //работа
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }

}
