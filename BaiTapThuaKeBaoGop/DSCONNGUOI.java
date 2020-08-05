package BaiTapThuaKeBaoGop;

import java.util.Scanner;

public class DSCONNGUOI {
    private int sl;
    private CONNGUOI DS[];

    public DSCONNGUOI() {
    }

    public DSCONNGUOI(int sl, CONNGUOI[] DS) {
        this.sl = sl;
        this.DS = DS;
    }

    public void InputDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHẬP SỐ LƯỢNG CON NGƯỜI: ");
        sl = sc.nextInt();
        DS = new CONNGUOI[sl];
        for (int i = 0; i < sl; i++) {
            System.out.println("Input 1: HỌC VIÊN -- Input 2: NHÂN VIÊN");
            int chon = sc.nextInt();
            if (chon == 1) {
                DS[i] = new HOCVIEN();
                DS[i].Input();
            } else if (chon == 2) {
                DS[i] = new NHANVIEN();
                DS[i].Input();
            }
        }
    }

    public void OutputDS() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("HOCVIEN")) {
                DS[i].Output();
            }
            if (DS[i].getClass().toString().contains("NHANVIEN")) {
                DS[i].Output();
            }
        }
    }

    public void OutputHV() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("HOCVIEN")) {
                DS[i].Output();
            }
        }
    }

    public void OutputNV() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("NHANVIEN")) {
                DS[i].Output();
            }
        }
    }
}
