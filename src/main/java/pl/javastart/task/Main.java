package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("food", "Eggs, milk, etc");
        Category category2 = new Category("clothes", "T-shirts, socks, etc");

        Product product1 = new Product("Cheese 500g", 6.5, "High protein cheese", category1);
        Product product2 = new Product("Bread", 5, "Gluten free", category1);
        Product product3 = new Product("T-shirt", 95.99, "Metallica t-shirt", category2);
        Product product4 = new Product("Desk", 459, "For kids", null);

        SpecialOffer specialOffer = new SpecialOffer(product3, "Your last chance!", "10.07.23-11.07.23", 0.2);

        System.out.println(product1.getInfo() + "\n" + product1.category.getInfo() + "\n");
        System.out.println(product2.getInfo() + "\n" + product2.category.getInfo() + "\n");
        System.out.println(product3.getInfo() + "\n" + product3.category.getInfo() + "\n");
        System.out.println(product4.getInfo());
    }
}
