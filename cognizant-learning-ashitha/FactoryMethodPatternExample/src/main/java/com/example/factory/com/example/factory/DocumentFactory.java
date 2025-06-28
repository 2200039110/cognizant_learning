package com.example.factory;

/**
 * Abstract factory class with a factory method.
 */
public abstract class DocumentFactory {
    /**
     * The factory method for creating documents.
     * Subclasses will override this to create specific document types.
     * @return A new Document instance.
     */
    public abstract Document createDocument();
} 