package BaiTapAbstractNguoi;

import java.util.Scanner;

public class HocVien extends Nguoi {

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

    public HocVien(float Diem1, float Diem2, float Diem3) {
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    public HocVien() {
    }

    public HocVien(float Diem1, float Diem2, float Diem3, String Ten, String NamSinh) {
        super(Ten, NamSinh);
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("HocVien{" + "Diem1=" + Diem1 + ", Diem2=" + Diem2 + ", Diem3=" + Diem3 + '}');
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Điểm 1: ");
        Diem1 = sc.nextFloat();
        System.out.print("Nhập Điểm 2: ");
        Diem2 = sc.nextFloat();
        System.out.print("Nhập Điểm 3: ");
        Diem3 = sc.nextFloat();
    }

}
