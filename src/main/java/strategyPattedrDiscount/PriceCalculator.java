package strategyPattedrDiscount;

public class PriceCalculator {
    //klasa do ustalania strategii

    private PricingStrategy pricingStrategy;
    private int price;
    private boolean isSignedUpForNewsletter;

    public void calculate(int price, boolean isSignedUpForNewsletter){
        pricingStrategy.calculatePrice(price,isSignedUpForNewsletter);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }
}
