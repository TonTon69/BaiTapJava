
package BaiTapNguoi;

import java.util.Scanner;

public class NhanVienCLCao extends NhanVien {
    private String TrinhDo;
    private String Nganh;
    private String NoiDaoTao;

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public String getNoiDaoTao() {
        return NoiDaoTao;
    }

    public void setNoiDaoTao(String NoiDaoTao) {
        this.NoiDaoTao = NoiDaoTao;
    }

    public NhanVienCLCao() {
    }

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao) {
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, float Luong, String NgayNhanViec) {
        super(Luong, NgayNhanViec);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    public NhanVienCLCao(String TrinhDo, String Nganh, String NoiDaoTao, float Luong, String NgayNhanViec, String Ten,
            int NamSinh) {
        super(Luong, NgayNhanViec, Ten, NamSinh);
        this.TrinhDo = TrinhDo;
        this.Nganh = Nganh;
        this.NoiDaoTao = NoiDaoTao;
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Trình Độ: ");
        TrinhDo = sc.nextLine();
        System.out.print("Nhập Ngành: ");
        Nganh = sc.nextLine();
        System.out.print("Nhập Nơi Đào Tạo: ");
        NoiDaoTao = sc.nextLine();
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println(
                "NhanVienCLCao{" + "TrinhDo=" + TrinhDo + ", Nganh=" + Nganh + ", NoiDaoTao=" + NoiDaoTao + '}');
    }

    @Override
    public String toString() {
        return "NhanVienCLCao{" + "TrinhDo=" + TrinhDo + ", Nganh=" + Nganh + ", NoiDaoTao=" + NoiDaoTao + '}';
    }

}
