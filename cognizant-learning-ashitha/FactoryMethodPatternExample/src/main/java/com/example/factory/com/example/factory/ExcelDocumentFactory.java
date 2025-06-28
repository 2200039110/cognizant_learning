package com.example.factory;

/**
 * Concrete factory for creating Excel documents.
 */
public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
} 