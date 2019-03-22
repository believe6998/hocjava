package controller;

import entity.Food;

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
        String descripton = scanner.nextLine();
        System.out.println("Nhập giá món:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Food food = new Food(foodId, name, descripton, price);
    };
    public void printList(){
        for (int i = 0; i < list.size(); i++) {
            Food food = list.get(i);
            System.out.println(food.toString());
        }
    };

}
