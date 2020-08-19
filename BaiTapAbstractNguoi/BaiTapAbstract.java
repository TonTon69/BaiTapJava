package BaiTapAbstractNguoi;

import java.util.Scanner;

public class BaiTapAbstract {
    public static void main(String[] args) {
        ListNguoi DS = new ListNguoi();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1: Nhập 1 Học Viên - Nhập 1 NV Quản Lý - Nhập 1 Giáo Viên");
            System.out.println("2: Xuất thông tin danh sách Học Viên");
            System.out.println("3: Xuất thông tin danh sách Nhân Viên Quản Lý");
            System.out.println("4: Xuất thông tin danh sách Giáo Viên");
            System.out.println("0: Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    DS.InputList();
                    break;
                case 2:
                    DS.OutputHV();
                    break;
                case 3:
                    DS.OutputNVQL();
                    break;
                case 4:
                    DS.OutputGV();
                    break;
                default:
                    choice = 0;
                    break;
            }
        } while (choice != 0);

    }

}
