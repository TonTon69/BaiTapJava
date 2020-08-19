package BaiTapAbstractNguoi;

import java.util.Scanner;

public class ListNguoi {

    private int sl;
    private Nguoi DS[];

    public ListNguoi() {
    }

    public ListNguoi(int sl, Nguoi[] DS) {
        this.sl = sl;
        this.DS = DS;
    }

    public void InputList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập CountNguoi: ");
        sl = sc.nextInt();
        DS = new Nguoi[sl];

        for (int i = 0; i < sl; i++) {
            System.out.println(
                    "Input 1: Nhập 1 Học Viên -- Input 2: Nhập 1 Nhân Viên Quản Lý -- Input 3: Nhập 1 Giáo Viên");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    DS[i] = new HocVien();
                    DS[i].Input();
                    break;
                case 2:
                    DS[i] = new NVQuanLy();
                    DS[i].Input();
                    break;
                case 3:
                    DS[i] = new GiaoVien();
                    DS[i].Input();
                    break;
                default:
                    break;
            }
        }
    }

    public void OutputHV() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("HocVien")) {
                DS[i].Output();
            }
        }
    }

    public void OutputNVQL() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("NVQuanLy")) {
                DS[i].Output();
            }

        }
    }

    public void OutputGV() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("GiaoVien")) {
                DS[i].Output();
            }
        }
    }
}
