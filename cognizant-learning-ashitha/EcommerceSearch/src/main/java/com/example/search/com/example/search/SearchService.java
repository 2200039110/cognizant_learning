package com.example.search;

import java.util.Arrays;

public class SearchService {

    /**
     * Linear search to find a product by its ID.
     * Time Complexity: O(n) because in the worst case, we have to iterate through the entire array.
     */
    public static Product linearSearch(Product[] products, String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Binary search to find a product by its ID. Assumes the products array is sorted by productId.
     * Time Complexity: O(log n) because the search area is halved in each step.
     */
    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(productId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
} 