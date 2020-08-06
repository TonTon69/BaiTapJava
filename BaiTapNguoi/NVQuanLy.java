
package BaiTapNguoi;

import java.util.Scanner;

public class NVQuanLy extends NhanVienCLCao {

    private float PhuCapCV;

    public float getPhuCapCV() {
        return PhuCapCV;
    }

    public void setPhuCapCV(float PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy() {
    }

    public NVQuanLy(float PhuCapCV) {
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(float PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao) {
        super(TrinhDo, Nganh, NoiDaoTao);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(float PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao, float Luong, String NgayNhanViec) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec);
        this.PhuCapCV = PhuCapCV;
    }

    public NVQuanLy(float PhuCapCV, String TrinhDo, String Nganh, String NoiDaoTao, float Luong, String NgayNhanViec,
            String Ten, int NamSinh) {
        super(TrinhDo, Nganh, NoiDaoTao, Luong, NgayNhanViec, Ten, NamSinh);
        this.PhuCapCV = PhuCapCV;
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Phụ Cấp CV: ");
        PhuCapCV = sc.nextFloat();
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("NVQuanLy{" + "PhuCapCV=" + PhuCapCV + '}');
    }

    @Override
    public String toString() {
        return "NVQuanLy{" + "PhuCapCV=" + PhuCapCV + '}';
    }

}
