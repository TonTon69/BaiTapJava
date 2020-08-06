
package BaiTapNguoi;

import java.util.Scanner;

public class HocVien extends Nguoi {
    private float diem1;
    private float diem2;
    private float diem3;

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    public HocVien() {
    }

    public HocVien(float diem1, float diem2, float diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public HocVien(float diem1, float diem2, float diem3, String Ten, int NamSinh) {
        super(Ten, NamSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("HocVien{" + "diem1=" + diem1 + ", diem2=" + diem2 + ", diem3=" + diem3 + '}');
    }

    @Override
    public String toString() {
        return "HocVien{" + "diem1=" + diem1 + ", diem2=" + diem2 + ", diem3=" + diem3 + '}';
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Điểm 1: ");
        diem1 = sc.nextFloat();
        System.out.print("Nhập Điểm 2: ");
        diem2 = sc.nextFloat();
        System.out.print("Nhập Điểm 3: ");
        diem3 = sc.nextFloat();

    }

}
