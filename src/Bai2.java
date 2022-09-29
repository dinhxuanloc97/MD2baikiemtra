import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int[][] arr = {{0, 0}};
        do {
            System.out.println("*****************MENU***************");
            System.out.println("1. Nhap gia tri cac phan tu cua mang");
            System.out.println("2. Hien thi phan tu cua mang theo ma tran");
            System.out.println("3. In gia tri cac phan tu tren cheo chinh cheo phu va tinh tong");
            System.out.println("4.sắp xếp tăng dần theo cột");
            System.out.println("5. thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap so hang");
                    a = scanner.nextInt();
                    System.out.println("nhap so cot");
                    b = scanner.nextInt();
                    arr = new int[a][b];
                    System.out.println("nhap cac phan tu cua mang");
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.printf("nhap phan tu [%d][%d] vao\n", i, j);
                            arr[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("cac p cua mang la: ");
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < b; j++) {
                            System.out.printf("%d\t", arr[i][j]);
                        }
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                case 4:
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("nhập lại từ 1-5");
            }
        } while (true);
    }
}