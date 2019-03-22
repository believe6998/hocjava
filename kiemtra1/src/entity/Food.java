package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Food {
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    private String foodId;
    private String name;
    private String description;
    private double price;
    private String createdAt = format.format(new Date());

    public Food() {
    }

    public Food(String foodId, String name, String description, double price, String createdAt) {
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

    public Food(String foodId, String name, String description, double price) {
        this.foodId = foodId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
//        return "Food{" +
//                "foodId='" + foodId + '\'' +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", price=" + price +
//                ", createdAt='" + createdAt + '\'' +
//                '}';
        return String.format("foodId: %s, name: %s, description: %s, price: %f, createAt: %s", foodId, name, description, price, createdAt);
    }
}
