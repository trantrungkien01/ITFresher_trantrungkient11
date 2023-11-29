import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        int size = 0;
        int choice;
        do {
            System.out.println("************************MENU**************************");
            System.out.println("1. Nhập giá trị n phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (>0) trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng và lẻ chia hết cho 3 ở cuối mảng");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm dần) đúng vị trí");
            System.out.println("9. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng phần tử của mảng: ");
                    size = sc.nextInt();
                    System.out.println("Nhập giá trị cho từng phần tử:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Phần tử thứ " + (i + 1) + ": ");
                        array[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử trong mảng:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    int count = 0;
                    for (int i = 0; i < size; i++) {
                        if (array[i] > 0) {
                            sum += array[i];
                            count++;
                        }
                    }
                    if (count > 0) {
                        double average = (double) sum / count;
                        System.out.println("Trung bình các phần tử dương trong mảng: " + average);
                    } else {
                        System.out.println("Không có phần tử dương trong mảng.");
                    }
                    break;
//                    case 4:
//                        System.out.print("Nhập giá trị k cần tìm: ");
//                        int k = sc.nextInt();
//                        System.out.print("Vị trí của các phần tử có giá trị " + k + " trong mảng: ");
//
//
//                        break;
//                    case 5:
//                        bubbleSortDescending();
//                        break;
//                    case 6:
//                        countPrimeNumbers();
//                        break;
//                    case 7:
//                        customSort();
//                        break;
//                    case 8:
//                        insertValue();
//                        break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại 1-9.");
            }
        } while (true);
    }
}




