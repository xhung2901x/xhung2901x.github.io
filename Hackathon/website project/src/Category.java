public enum Category {
    VGA(1), SSD(2), MEMORY(3), GEAR(4);

    public int value;
    

    private Category(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
}
