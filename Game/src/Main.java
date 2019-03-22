import entity.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả:");
        String decription = scanner.nextLine();
        System.out.println("Nhập giá:");
        double price = scanner.nextDouble();
        System.out.println("Nhập ngày phát hành:");
        String releaseAt = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập trang chủ:");
        String website = scanner.nextLine();
        Game game = new Game(name, decription, price, releaseAt, website);
        System.out.println(game.toString());
    }
}
