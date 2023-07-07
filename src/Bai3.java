import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Nhập số lượng sinh viên cần tạo:");
        int n = sc.nextInt();


        String[] hoTen = new String[n];
        Double[] diem = new Double[n];
        String[] hocLuc = new String[n];


//Nhập họ tên và phân loại theo học lực
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ "+ (i+1));


            System.out.println("Nhập họ và tên: ");
            hoTen[i] = sc.nextLine();
            sc.nextLine();

            System.out.println("Nhập điểm của bạn: ");
            diem[i] = sc.nextDouble();

            if (diem[i] < 5) {
                hocLuc[i] = "Yếu";
            } else if (diem[i] < 6.5) {
                hocLuc[i] = "Trung Bình";
            } else if (diem[i] < 7.5) {
                hocLuc[i] = "Khá";
            } else if (diem[i] < 9) {
                hocLuc[i] = "Giỏi";
            } else {
                hocLuc[i] = "Xuất sắc";
            }
        }
//Xuất 2 mảng đã nhập:
        for (int i = 0; i < n; i++) {
            System.out.println("Họ và tên: " + hoTen[i] + "Điểm số là: " + diem[i] + "được xếp loại học lực " + hocLuc[i]);
        }


//Sắp xếp sinh viên theo điểm tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;

                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    String tempHocLuc = hocLuc[i];
                    hocLuc[i] = hocLuc[j];
                    hocLuc[j] = tempHocLuc;
                }
            }
        }

        System.out.println("DANH SÁCH SINH VIÊN SẮP XẾP THEO ĐIỂM SỐ TĂNG DẦN");
        for (int k = 0; k < n; k++) {
            System.out.println("Họ và tên: " + hoTen[k] + "Điểm số là: " + diem[k] + "được xếp loại học lực " + hocLuc[k]);
        }
    }
}