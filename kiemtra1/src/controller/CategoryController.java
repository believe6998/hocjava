package controller;

import entity.Category;
import entity.Food;

import java.util.ArrayList;

public class CategoryController {
    private ArrayList<Category> list = new ArrayList<>();

    public ArrayList<Category> getList() {
        return list;
    }

    public void setList(ArrayList<Category> list) {
        this.list = list;
    }

    public void addCategory(){
        Category c1 = new Category("C01", "Đồ ăn");
        Category c2 = new Category("C02", "Đồ uống");
        list.add(c1);
        list.add(c2);
    }

}
