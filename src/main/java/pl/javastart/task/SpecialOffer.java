package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String dateRange;
    double discount;

    SpecialOffer(Product product, String description, String dateRange, double discount) {
        this.product = product;
        this.description = description;
        this.dateRange = dateRange;
        this.discount = discount;
    }
}
