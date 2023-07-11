package pl.javastart.task;

public class Category {
    String name;
    String description;

    Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getInfo() {
        return "Category: " + name + "\nDescription: " + description;
    }
}
