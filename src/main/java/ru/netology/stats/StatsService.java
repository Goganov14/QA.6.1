package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(int[] sales) {
        int sum = 0;
        int average = 0;
        for (int sale : sales) {
            sum += sale;
            average = sum / sales.length;

        }
        return average;
    }

    public int highSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessAverageSales(int[] sales) {
        int avg = average(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int moreAverageSales(int[] sales) {
        int avg = average(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}




