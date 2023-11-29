import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Nhập vào số dòng của mảng: ");
        int row = sc.nextInt();
        System.out.print("Nhập vào số cột của mảng: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        do {
            System.out.println("************************MENU**************************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và đường chéo phụ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng, thực hiện chèn vào mảng 2 chiều");
            System.out.println("9. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print("Nhập gia tri phần tử  [" + i + "][" + j + "]: ");
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.print(matrix[i][j] + "In giá trị các phần tử mảng theo ma trận ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ nhập lại 1-9");
                    break;
            }
        } while (true);
    }
}



