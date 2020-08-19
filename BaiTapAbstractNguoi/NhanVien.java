package BaiTapAbstractNguoi;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    protected float Luong;
    protected String NgayNhanViec;

    PhongBanKhoa pbk = new PhongBanKhoa();

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }

    public String getNgayNhanViec() {
        return NgayNhanViec;
    }

    public void setNgayNhanViec(String NgayNhanViec) {
        this.NgayNhanViec = NgayNhanViec;
    }

    public NhanVien() {
    }

    public NhanVien(float Luong, String NgayNhanViec) {
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
    }

    public NhanVien(float Luong, String NgayNhanViec, String Ten, String NamSinh) {
        super(Ten, NamSinh);
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("NhanVien{" + "Luong=" + Luong + ", NgayNhanViec=" + NgayNhanViec + '}');
        pbk.OutputPBK();
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Lương: ");
        Luong = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhập Ngày Nhận Việc: ");
        NgayNhanViec = sc.nextLine();
        pbk.InputPBK();
    }
}
