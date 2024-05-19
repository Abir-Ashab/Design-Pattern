interface Document {
    void open();
    void close();
    void save();
    void revert();
    String getState();
}