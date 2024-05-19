class CsvApplication extends DocumentApplication {
    
    @Override
    Document createDocument() {
        return new CsvDocument();
    }
}