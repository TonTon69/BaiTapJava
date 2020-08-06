package BaiTapNguoi;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        DSNguoi ds = new DSNguoi();
        Nguoi ng = new Nguoi();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1: NHẬP 1 HỌC VIÊN & NHẬP 1 NHÂN VIÊN QUẢN LÝ & NHẬP 1 GIÁO VIÊN");
            System.out.println("2: XUẤT DANH SÁCH HỌC VIÊN");
            System.out.println("3: XUẤT DANH SÁCH NHÂN VIÊN QUẢN LÝ");
            System.out.println("4: XUẤT DANH SÁCH GIÁO VIÊN");
            System.out.println("0: THOÁT");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ds.InputDS();
                    break;
                case 2:
                    ds.OutputHV();
                    break;
                case 3:
                    ds.OutputNVQL();
                    break;
                case 4:
                    ds.OutputGV();
                    break;
                default:
                    choice = 0;
                    break;
            }
        } while (choice != 0);
    }

}
