public class Main {
    public static void main(String[] args) {
        DocumentApplication textApp = new TextApplication();
        textApp.performOperations();

        DocumentApplication csvApp = new CsvApplication();
        csvApp.performOperations();
    }
}