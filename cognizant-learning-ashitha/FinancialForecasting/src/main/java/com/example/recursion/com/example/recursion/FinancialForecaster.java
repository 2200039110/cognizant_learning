package com.example.recursion;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecaster {

    /**
     * Recursive method to calculate future value.
     * Time Complexity: O(2^n) without memoization, due to overlapping subproblems.
     */
    public static double calculateFutureValueRecursive(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }
        return calculateFutureValueRecursive(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    /**
     * Optimized recursive method using memoization to calculate future value.
     * Time Complexity: O(n) with memoization, as each subproblem is solved only once.
     */
    public static double calculateFutureValueMemoized(double presentValue, double growthRate, int periods) {
        Map<Integer, Double> memo = new HashMap<>();
        return calculateFutureValueMemoized(presentValue, growthRate, periods, memo);
    }

    private static double calculateFutureValueMemoized(double presentValue, double growthRate, int periods, Map<Integer, Double> memo) {
        if (periods == 0) {
            return presentValue;
        }
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }
        double futureValue = calculateFutureValueMemoized(presentValue, growthRate, periods - 1, memo) * (1 + growthRate);
        memo.put(periods, futureValue);
        return futureValue;
    }
} 