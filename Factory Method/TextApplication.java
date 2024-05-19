class TextApplication extends DocumentApplication {
    
    @Override
    Document createDocument() {
        return new TextDocument();
    }
}