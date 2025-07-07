package hotel;

public enum RoomType {
    
    SINGLE(1, 50.00, "One single bed, a private bathroom, a desk, and free wifi."),
    DOUBLE(2, 80.00, "One full-size (double) bed, a private bathroom, a smart tv, a desk, and free wifi."),
    TWIN(2, 80.00, "Two single beds, a private bathroom, a smart tv, a desk, and free wifi."),
    SUITE(4, 200.00, "One king-sized bed, two single bed, a living room, a private shower, a balcony.");
    
    private final int maxGuest;
    private final double basePrice;
    private final String description;
    
    RoomType(int maxGuest, double basePrice, String description) {
        this.maxGuest = maxGuest;
        this.basePrice = basePrice;
        this.description = description;
    }
    
    public int maxGuest() {
        return this.maxGuest;
    }
    public double basePrice() {
        return this.basePrice;
    }
    public String description() {
        return this.description;
    }
    
    
}