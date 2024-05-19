class CsvDocument implements Document {
    private String state;

    @Override
    public void open() {
        state = "opened";
    }

    @Override
    public void close() {
        state = "closed";
    }

    @Override
    public void save() {
        state = "saved";
    }

    @Override
    public void revert() {
        state = "reverted";
    }

    @Override
    public String getState() {
        return state;
    }
}