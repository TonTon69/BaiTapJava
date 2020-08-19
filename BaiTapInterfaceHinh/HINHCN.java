package BaiTapInterfaceHinh;

import java.util.Scanner;

public class HINHCN implements IHINH {

    private float dai;
    private float rong;

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    public HINHCN() {
    }

    public HINHCN(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập dài: ");
        dai = sc.nextFloat();
        System.out.print("Nhập rộng: ");
        rong = sc.nextFloat();
    }

    @Override
    public void Output() {
        System.out.println("HINHCN{" + "dai=" + dai + ", rong=" + rong + ", Diện tích=" + DienTich() + ", Chu vi="
                + ChuVi() + '}');
    }

    @Override
    public float DienTich() {
        return dai * rong;
    }

    @Override
    public float ChuVi() {
        return (dai + rong) * 2;
    }

}
