package BaiTapThuaKeBaoGop;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {
        DSCONNGUOI ds = new DSCONNGUOI();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1: NHẬP 1 HỌC VIÊN");
            System.out.println("2: NHẬP 1 NHÂN VIÊN");
            System.out.println("3: XUẤT DANH SÁCH HỌC VIÊN");
            System.out.println("4: XUẤT DANH SÁCH NHÂN VIÊN");
            System.out.println("0: THOÁT");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ds.InputDS();
                    break;
                case 2:
                    ds.InputDS();
                    break;
                case 3:
                    ds.OutputHV();
                    break;
                case 4:
                    ds.OutputNV();
                    break;
                default:
                    choice = 0;

            }
        } while (choice != 0);
    }

}
