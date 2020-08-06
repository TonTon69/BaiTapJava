
package BaiTapNguoi;

import java.util.Scanner;

public class DSNguoi {
    private int sl;
    private Nguoi DS[];

    public DSNguoi() {
    }

    public DSNguoi(int sl, Nguoi[] DS) {
        this.sl = sl;
        this.DS = DS;
    }

    public void InputDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng người: ");
        sl = sc.nextInt();
        DS = new Nguoi[sl];
        for (int i = 0; i < sl; i++) {
            System.out.println("Input 1: HỌC VIÊN -- Input 2: NHÂN VIÊN QUẢN LÝ -- Input 3: GIÁO VIÊN");
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
                    throw new AssertionError();
            }
        }
    }

    public void OutputDS() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("HocVien")) {
                DS[i].Output();
            }
            if (DS[i].getClass().toString().contains("NVQuanLy")) {
                DS[i].Output();
            }
            if (DS[i].getClass().toString().contains("GiaoVien")) {
                DS[i].Output();
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
