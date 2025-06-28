package com.example.search;

import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P003", "Laptop", "Electronics"),
            new Product("P001", "Smartphone", "Electronics"),
            new Product("P005", "Book", "Education"),
            new Product("P002", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product foundProduct = SearchService.linearSearch(products, "P005");
        System.out.println("Found: " + foundProduct);
        System.out.println("--------------------");

        // For binary search, the array must be sorted.
        Arrays.sort(products);

        // Binary Search
        System.out.println("Binary Search:");
        foundProduct = SearchService.binarySearch(products, "P005");
        System.out.println("Found: " + foundProduct);
        
        System.out.println("\n--- Analysis ---");
        System.out.println("Linear Search Time Complexity: O(n)");
        System.out.println("Binary Search Time Complexity: O(log n)");
        System.out.println("Binary search is more suitable for large datasets as it is significantly faster than linear search, but it requires the data to be sorted.");
    }
} 