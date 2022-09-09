package strategyPattedrDiscount;

public class SalePrice implements PricingStrategy{

    private int price;
    boolean isSignedUpForNewsletter;

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter){
            System.out.println(price * 0.5);
        } else {
            System.out.println("There is not a discount");
        }
    }
}
