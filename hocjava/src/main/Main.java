package main;

import controller.EmployeeController;
import controller.MyController;
import controller.StudentController;
import controller.ApplicationController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn quản lý sinh viên hay nhân viên:");
        System.out.println("1. Sinh viên.");
        System.out.println("2. Nhân viên.");
        System.out.println("3. Muốn về.");
        System.out.println("Vui lòng nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        MyController controller = null;
        switch (choice) {
            case 1:
                controller = new StudentController();
                System.out.println("Quản lý sinh viên");
                break;
            case 2:
                controller = new EmployeeController();
                System.out.println("Quản lý nhân viên");
                break;
            case 3:
                System.out.println("Hẹn gặp lại tại kỳ thi...lại!");
                System.exit(1);
                break;
            default:
                System.out.println("Lựa chọn sai. Vui lòng nhập số từ 1 đến 3.");
                break;
        }
        if(controller != null)
        {
            controller.create();
            controller.read();
        }
    }
}



