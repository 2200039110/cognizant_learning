package com.example.recursion;

public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; // 5%
        int periods = 10;

        System.out.println("Calculating Future Value without memoization:");
        double futureValue = FinancialForecaster.calculateFutureValueRecursive(presentValue, growthRate, periods);
        System.out.printf("Future value after %d periods: %.2f%n", periods, futureValue);

        System.out.println("\nCalculating Future Value with memoization:");
        double futureValueMemoized = FinancialForecaster.calculateFutureValueMemoized(presentValue, growthRate, periods);
        System.out.printf("Future value after %d periods (memoized): %.2f%n", periods, futureValueMemoized);

        System.out.println("\n--- Analysis ---");
        System.out.println("The simple recursive solution has a time complexity of O(2^n), which is inefficient for large 'n'.");
        System.out.println("The memoized solution has a time complexity of O(n), which is much more efficient as it avoids re-computing values for the same period.");

    }
} 