package BaiTapAbstractNguoi;

import java.util.Scanner;

public class GiaoVien extends NhanVienCLCao {
    private float ThuLaoGD;

    public float getThuLaoGD() {
        return ThuLaoGD;
    }

    public void setThuLaoGD(float ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien() {
    }

    public GiaoVien(float ThuLaoGD) {
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(float ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao) {
        super(TrinhDo, Nganh, NoiDaoTao);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(float ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao, float Luong, String NgayNhanViec) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec);
        this.ThuLaoGD = ThuLaoGD;
    }

    public GiaoVien(float ThuLaoGD, String TrinhDo, String Nganh, String NoiDaoTao, float Luong, String NgayNhanViec,
            String Ten, String NamSinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, Ten, NamSinh);
        this.ThuLaoGD = ThuLaoGD;
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("GiaoVien{" + "ThuLaoGD=" + ThuLaoGD + "Luong=" + TinhLuong() + '}');
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Thù Lao GD: ");
        ThuLaoGD = sc.nextFloat();
    }

    @Override
    public float TinhLuong() {
        return Luong + ThuLaoGD;
    }

}
