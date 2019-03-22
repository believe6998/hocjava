package entity;

import controller.CategoryController;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCategory {
    public void createMenuCategory(Food food) {
        Scanner scanner = new Scanner(System.in);
        CategoryController categoryController = new CategoryController();
        categoryController.addCategory();
        ArrayList<Category> list = categoryController.getList();
        while (true) {
            System.out.println("-------Danh mục------");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i).getCategoryName());
            }
            System.out.println("---------------------");
            int choice = scanner.nextInt();
            for (int i = 0; i < list.size(); i++) {
                if (choice == i + 1) {
                    Category category = list.get(i);
                    food.setCategoryId(category.getCategoryId());
                    food.setCategoryName(category.getCategoryName());
                    return;
                }
            }

        }
    }
}
