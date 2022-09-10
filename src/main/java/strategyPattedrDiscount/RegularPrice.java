package strategyPattedrDiscount;

public class RegularPrice implements PricingStrategy{

    private int price;
    boolean isSignedUpForNewsletter;

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter){
            System.out.println("regular: " + price);
        } else {
            System.out.println("There is a discount");
        }
    }
}
