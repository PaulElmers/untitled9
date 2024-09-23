package discount;

public class SeasonalDiscount implements DiscountStrategy {
    private double seasonalRate;

    public SeasonalDiscount(double seasonalRate) {
        this.seasonalRate = seasonalRate;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * seasonalRate;
    }
}
