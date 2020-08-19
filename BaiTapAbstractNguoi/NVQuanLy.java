package BaiTapAbstractNguoi;

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

    @Override
    public void Output() {
        super.Output();
        System.out.println("NVQuanLy{" + "PhuCapCV=" + PhuCapCV + ", Luong=" + TinhLuong() + '}');
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Phụ Cấp CV: ");
        PhuCapCV = sc.nextFloat();
    }

    @Override
    public float TinhLuong() {
        return Luong + PhuCapCV;
    }
}
