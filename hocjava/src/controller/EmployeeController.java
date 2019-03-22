package controller;

import entity.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController implements MyController {
    private ArrayList<Employee> list = new ArrayList<>();

    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã số nhân viên: ");
        String employeeId = scanner.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập Địa chỉ nhân viên: ");
        String address = scanner.nextLine();
        Employee e1 = new Employee(employeeId, name, age, address);
        list.add(e1);
    }

    @Override
    public void read() {
        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            System.out.printf("Tên nhân viên: %s \n Mã nhân viên: %s \n Tuổi nhân viên: %d \n Địa chỉ: %s",
                    e.getName(),
                    e.getEmployeeId(),
                    e.getAge(),
                    e.getAddress()
            );

        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
