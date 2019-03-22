package entity;


public class Food extends Category {
    private String foodId;
    private String name;
    private String description;
    private double price;
    private String createdAt;

    public Food() {
    }

    public Food(String categoryId, String categoryName, String foodId, String name, String description, double price, String createdAt) {
        super(categoryId, categoryName);
        this.foodId = foodId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }


    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format("foodId: %s, name: %s, description: %s, price: %f, createAt: %s, category: %s", this.foodId, this.name, this.description, this.price, this.createdAt, this.getCategoryName());
    }
}
