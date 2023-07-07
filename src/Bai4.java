import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+================================+");
            System.out.println("1. Tinh tien dien");
            System.out.println("2. Sap xep mang");
            System.out.println("3. Diem sinh vien");
            System.out.println("4. Ket thuc");
            System.out.println("+================================+");
            System.out.print("Nhap lua chon cua ban (1-4): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Bai1.main(args);
                    break;
                case 2:
                    Bai2.main(args);
                    break;
                case 3:
                    Bai3.main(args);
                    break;
                case 4:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!");
                    break;
            }
        } while (choice != 4);
    }
    }