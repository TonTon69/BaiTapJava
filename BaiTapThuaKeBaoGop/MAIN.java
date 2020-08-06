package BaiTapThuaKeBaoGop;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {
        DSCONNGUOI ds = new DSCONNGUOI();
        CONNGUOI cn = new CONNGUOI();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1: NHẬP 1 HỌC VIÊN & NHẬP 1 NHÂN VIÊN");
            System.out.println("2: XUẤT DANH SÁCH HỌC VIÊN");
            System.out.println("3: XUẤT DANH SÁCH NHÂN VIÊN");
            System.out.println("4: THÊM 1 CON NGƯỜI VÀO DANH SÁCH");
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
                    ds.OutputNV();
                    break;
                case 4:
                    ds.themCN(cn);
                    System.out.println("--DANH SÁCH CON NGƯỜI SAU KHI THÊM--");
                    ds.OutputDS();
                    break;

                default:
                    choice = 0;
                    break;
            }
        } while (choice != 0);
    }

}
