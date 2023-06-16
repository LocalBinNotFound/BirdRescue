package Birds;

/**
 * Helper class that associates food quantity with food unit.
 */
public class Quantity {
    private int quantity;
    private String unit;

    public Quantity(int quantity, String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}
