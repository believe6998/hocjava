package controller;

import java.util.Scanner;

public class MenuController {
    public void generateEployeeMenu() {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        while (true) {
            System.out.println("----Menu----");
            System.out.println("1.NHập tên sinh viên");
            System.out.println("2.In danh sách sinh viên");
            System.out.println("3.Thoát");
            System.out.println("Lựa chọn của bạn là: ");
            char choice;
            choice = scanner.next().charAt(0);
            switch (choice){
                case '1':
//                    studentController.createStudent();
                    break;
                case '2':
//                    studentController.printStudentInformation();
                    break;
                case '3':
                    System.out.println("Hẹn gặp lại");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập không hợp lệ, vui lòng chọn từ 1-3.");
            }
//            System.out.println("bạn có muốn tiếp tục không? (y/n)");
//            String i = scanner.nextLine();
//            if (i.equals("n")){
//                break;
//            }
        }

    }

    public void generateStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----Menu----");
            System.out.println("1.TRa cứu điểm thi.");
            System.out.println("2.Xem thông tin lớp học");
            System.out.println("3.Thoát");
            System.out.println("Lựa chọn của bạn là: ");
            char choice;
            choice = scanner.next().charAt(0);

            switch (choice){
                case '1':
                    System.out.println("TRa cứu");
                    break;
                case '2':
                    System.out.println("xem thời khóa biểu");
                    break;
                case '3':
                    System.out.println("Hẹn gặp lại");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập không hợp lệ, vui lòng chọn từ 1-3.");
            }
//            System.out.println("bạn có muốn tiếp tục không? (y/n)");
//            String i = scanner.nextLine();
//            if (i.equals("n")){
//                break;
//            }
        }

    }}
