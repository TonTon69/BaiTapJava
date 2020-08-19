package BaiTapInterfaceHinh;

import java.util.Scanner;

public class HINHVUONG implements IHINH {

    private float canh;

    public HINHVUONG() {
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

    public HINHVUONG(float canh) {
        this.canh = canh;
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh: ");
        canh = sc.nextFloat();
    }

    @Override
    public void Output() {
        System.out.println("HINHVUONG{" + "canh=" + canh + ", Diện tích=" + DienTich() + ", Chu vi=" + ChuVi() + '}');
    }

    @Override
    public float DienTich() {
        return canh * canh;
    }

    @Override
    public float ChuVi() {
        return canh * 4;
    }
}
