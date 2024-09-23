package discount;

public class Main {
    public static void main(String[] args) {
        Product phone = new Product("TV", 300.0);
        Product laptop = new Product("Fridge", 1080.0);

        DiscountStrategy percentageDiscount = new PercentageDiscount(10);
        DiscountStrategy fixedAmountDiscount = new FixedAmountDiscount(50);
        DiscountStrategy seasonalDiscount = new SeasonalDiscount(0.8);

        System.out.println(phone.getName() + " після процентної знижки: $" + phone.applyDiscount(percentageDiscount));
        System.out.println(laptop.getName() + " після фіксованої знижки: $" + laptop.applyDiscount(fixedAmountDiscount));
        System.out.println(phone.getName() + " після сезонної знижки: $" + phone.applyDiscount(seasonalDiscount));
    }
}
