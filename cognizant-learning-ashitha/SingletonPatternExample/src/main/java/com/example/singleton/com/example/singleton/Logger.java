package com.example.singleton;

/**
 * Logger class implementing the Singleton pattern.
 * Ensures that only one instance of Logger is created.
 */
public class Logger {

    // Private static instance of the same class
    private static Logger instance;

    // Private constructor to restrict instantiation from other classes
    private Logger() {
        // Private constructor to prevent instantiation
    }

    /**
     * Public static method to get the instance of the Logger class.
     * This is the global access point for the singleton instance.
     * @return The single instance of the Logger.
     */
    public static Logger getInstance() {
        if (instance == null) {
            // If instance is not created, create one
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }
} 