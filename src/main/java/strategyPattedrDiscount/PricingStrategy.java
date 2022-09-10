package strategyPattedrDiscount;

public interface PricingStrategy {
    void calculatePrice(int price, boolean isSignedUpForNewsletter);
}
