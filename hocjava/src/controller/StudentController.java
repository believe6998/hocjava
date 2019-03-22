package controller;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController implements MyController {
    private ArrayList<Student> list = new ArrayList<>();

    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã số sinh viên: ");
        String rollNumber = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập Địa chỉ sinh viên: ");
        String address = scanner.nextLine();
        Student sv1 = new Student(rollNumber, name, age, address);
        list.add(sv1);

    }

    @Override
    public void read() {
        for (int i = 0; i < list.size(); i++) {
            Student sv = list.get(i);
            System.out.printf("Tên sinh viên: %s \n Mã sinh viên: %s \n Tuổi sinh viên: %d \n Địa chỉ: %s\n",
                    sv.getName(),
                    sv.getRollNumber(),
                    sv.getAge(),
                    sv.getAddress()
            );
            sv.docSach();

        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
