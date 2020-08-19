package BaiTapInterfaceHinh;

import java.util.Scanner;

public class ListHinh {
    private int sl;
    private IHINH DS[];

    public ListHinh() {
    }

    public ListHinh(int sl, IHINH[] DS) {
        this.sl = sl;
        this.DS = DS;
    }

    public void InputList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập CountHinh: ");
        sl = sc.nextInt();
        DS = new IHINH[sl];

        for (int i = 0; i < sl; i++) {
            System.out.println(
                    "Input 1: Nhập 1 Hình Vuông -- Input 2: Nhập 1 Hình Chữ Nhật -- Input 3: Nhập 1 Giáo Viên");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    DS[i] = new HINHVUONG();
                    DS[i].Input();
                    break;
                case 2:
                    DS[i] = new HINHCN();
                    DS[i].Input();
                    break;
                case 3:
                    DS[i] = new HINHTRON();
                    DS[i].Input();
                    break;
                default:
                    System.out.println("Bạn phải chọn 1 trong 3 loại trên");
                    break;
            }
        }
    }

    public void OutputHV() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("HINHVUONG")) {
                DS[i].Output();
            }
        }
    }

    public void OutputHCN() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("HINHCN")) {
                DS[i].Output();
            }

        }
    }

    public void OutputHT() {
        for (int i = 0; i < sl; i++) {
            if (DS[i].getClass().toString().contains("HINHTRON")) {
                DS[i].Output();
            }
        }
    }
}
