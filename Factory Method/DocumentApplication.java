abstract class DocumentApplication {
   
    abstract Document createDocument();
   
    void performOperations() {
        Document document = createDocument();
        document.open();
        System.out.println("State after opening: " + document.getState());
        
        document.save();
        System.out.println("State after saving: " + document.getState());
        
        document.close();
        System.out.println("State after closing: " + document.getState());
        
        document.revert();
        System.out.println("State after reverting: " + document.getState());
        
        System.out.println("Final state: " + document.getState());
    }
}