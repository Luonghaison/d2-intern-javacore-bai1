import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //dùng nổi bọt
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Dich cac phan tu 0 ve cuoi mang
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else {
                break;
            }
        }

        for (int i = countZero; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < countZero; i++) {
            System.out.print("0 ");
        }
    }
    }

