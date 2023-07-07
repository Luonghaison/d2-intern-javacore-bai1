import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình tính tiền điện");
        System.out.println("Nhập số kWh sử dụng trong tháng:");
        int soKwh = sc.nextInt();

        double tienDien;
        if (soKwh<50){
            tienDien = soKwh*1678;
        } else if (soKwh<=100) {
            tienDien= 50*1678 + (soKwh-50)*1734;
        } else if (soKwh<=200){
            tienDien = 50*1678 + 50*1734 + (soKwh-100)*2014;
        } else if (soKwh<=300) {
            tienDien = 50*1678 + 50*1734 + 100*2014 + (soKwh-200)*2536;
        }
        else if (soKwh<=400){
            tienDien = 50*1678 + 50*1734 + 100*2014 + 100*2536 + (soKwh-300)*2834;
        } else {
            tienDien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (soKwh - 400) * 2927;
        }
        System.out.println("Tháng này bạn đã sử dụng "+ soKwh +" kwh tiền điện");
        System.out.println("Tổng số tiền bạn phải thanh toán là: "+ tienDien);
    }
}