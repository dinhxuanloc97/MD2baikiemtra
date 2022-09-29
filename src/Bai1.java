import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int arrdai = 0;
        int[] arr = {0};
        do {
            System.out.println("**********MeNu*************");
            System.out.println("1.Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");
            System.out.println(" lựa chon của bạn là :");
            int bailam = sr.nextInt();
            switch (bailam){
                case 1:
                    System.out.println("Nhập vào chi số  của mảng");
                    arrdai = sr.nextInt();
                    arr = new int[arrdai];
                    System.out.println("Nhập các phần tử của mảng");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = sr.nextInt();
                    } break;
                case 2:
                    System.out.println("Các phần tử của mảng là :");
                    for (int i = 0 ; i <arr.length; i++){
                        System.out.printf("%d\t ",arr[i]);
                    }
                    System.out.println("\n");
                    break;

                case 3:
                System.out.println("cac so nguyen to trong mang la: ");
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 2) {
                        boolean check = false;
                        for (int j = 2; j < arr[i]; j++) {
                            if (arr[i] % j == 0) {
                                check = true;
                            }
                        }
                        if (!check) {
                            System.out.printf("%d\t", arr[i]);
                        }
                    }
                }
                    System.out.println("\n");
                    break;
            case 4:
                int min = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
                System.out.printf("Phần tử nhỏ nhất trong mảng là  %d\n", min);
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > min) {
                        max = arr[i];
                    }
                }
                System.out.printf("Phần tử lớn nhất trong mảng là  %d\n", max);
                break;
                case 5:
                    System.out.println("Mảng sắp xếp giảm dần là ");
                    for (int i = 0; i < arr.length ; i++) {
                        for (int j =i; j < arrdai; j++) {
                            if (arr[i] < arr[j]) {
                                int giam = arr[i];
                                arr[i] = arr[j];
                                arr[j] = giam;
                            }
                        }
                        System.out.printf("%d\t", arr[i]);
                    }
                    System.out.println("\n");
                    break;
                case 6: System.exit(0);
                    break;
                default:
                    System.err.printf("Vui lòng nhập lại từ 1 đến 4 :");
            }
        }while(true);

    }
}
