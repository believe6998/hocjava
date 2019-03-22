package controller;

import entity.Category;
import entity.Food;
import entity.MenuCategory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FoodController {
    private ArrayList<Food> list = new ArrayList<>();
    public void addFood(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã món:");
        String foodId = scanner.nextLine();
        System.out.println("Nhập tên món:");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả món:");
        String description = scanner.nextLine();
        System.out.println("Nhập giá món:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập ngày tạo món:");
        String createdAt = scanner.nextLine();
        Food foodCategory = new Food();
        MenuCategory menuCategory = new MenuCategory();
        menuCategory.createMenuCategory(foodCategory);
        Food food = new Food(foodCategory.getCategoryId(),foodCategory.getCategoryName(),foodId,name,description,price,createdAt);
        list.add(food);
    };
    public void printList(){
        for (int i = 0; i < list.size(); i++) {
            Food food = list.get(i);
            System.out.println(food.toString());
        }
    };

}
