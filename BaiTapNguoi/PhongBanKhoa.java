
package BaiTapNguoi;

import java.util.Scanner;

public class PhongBanKhoa {
    private String MaPBK;
    private String TenPBK;

    public String getMaPBK() {
        return MaPBK;
    }

    public void setMaPBK(String MaPBK) {
        this.MaPBK = MaPBK;
    }

    public String getTenPBK() {
        return TenPBK;
    }

    public void setTenPBK(String TenPBK) {
        this.TenPBK = TenPBK;
    }

    public PhongBanKhoa() {
    }

    public PhongBanKhoa(String MaPBK, String TenPBK) {
        this.MaPBK = MaPBK;
        this.TenPBK = TenPBK;
    }

    public void InputPBK() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã PBK: ");
        MaPBK = sc.nextLine();
        System.out.print("Nhập Tên PBK: ");
        TenPBK = sc.nextLine();
    }

    public void OutputPBK() {
        System.out.println("PhongBanKhoa{" + "MaPBK=" + MaPBK + ", TenPBK=" + TenPBK + '}');
    }

    @Override
    public String toString() {
        return "PhongBanKhoa{" + "MaPBK=" + MaPBK + ", TenPBK=" + TenPBK + '}';
    }

}
