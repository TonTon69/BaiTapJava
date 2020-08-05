package BaiTapThuaKeBaoGop;

import java.util.Scanner;

public class HOCVIEN extends CONNGUOI {
    private float Diem1;
    private float Diem2;
    private float Diem3;

    public float getDiem1() {
        return Diem1;
    }

    public void setDiem1(float Diem1) {
        this.Diem1 = Diem1;
    }

    public float getDiem2() {
        return Diem2;
    }

    public void setDiem2(float Diem2) {
        this.Diem2 = Diem2;
    }

    public float getDiem3() {
        return Diem3;
    }

    public void setDiem3(float Diem3) {
        this.Diem3 = Diem3;
    }

    public HOCVIEN() {
    }

    public HOCVIEN(float Diem1, float Diem2, float Diem3) {
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    public HOCVIEN(float Diem1, float Diem2, float Diem3, String HOTEN, int NAMSINH) {
        super(HOTEN, NAMSINH);
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("NHẬP ĐIỂM 1: ");
        Diem1 = sc.nextFloat();
        System.out.print("NHẬP ĐIỂM 2: ");
        Diem2 = sc.nextFloat();
        System.out.print("NHẬP ĐIỂM 3: ");
        Diem3 = sc.nextFloat();

    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("HOCVIEN{" + "Diem1=" + Diem1 + ", Diem2=" + Diem2 + ", Diem3=" + Diem3 + '}');

    }

    @Override
    public String toString() {
        return "HOCVIEN{" + "Diem1=" + Diem1 + ", Diem2=" + Diem2 + ", Diem3=" + Diem3 + '}';
    }
}
