package BaiTapThuaKeBaoGop;

import java.util.Scanner;

public class NHANVIEN extends CONNGUOI {

    private float LUONG;
    private String NGAYNHANVIEC;

    PHONGBANKHOA pbk = new PHONGBANKHOA();

    public float getLUONG() {
        return LUONG;
    }

    public void setLUONG(float LUONG) {
        this.LUONG = LUONG;
    }

    public String getNGAYNHANVIEC() {
        return NGAYNHANVIEC;
    }

    public void setNGAYNHANVIEC(String NGAYNHANVIEC) {
        this.NGAYNHANVIEC = NGAYNHANVIEC;
    }

    public NHANVIEN() {
    }

    public NHANVIEN(float LUONG, String NGAYNHANVIEC) {
        this.LUONG = LUONG;
        this.NGAYNHANVIEC = NGAYNHANVIEC;
    }

    public NHANVIEN(float LUONG, String NGAYNHANVIEC, String HOTEN, int NAMSINH) {
        super(HOTEN, NAMSINH);
        this.LUONG = LUONG;
        this.NGAYNHANVIEC = NGAYNHANVIEC;
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("NHẬP LƯƠNG: ");
        LUONG = sc.nextFloat();
        sc.nextLine();
        System.out.print("NHẬP NGÀY NHẬN VIỆC: ");
        NGAYNHANVIEC = sc.nextLine();

        pbk.InputPBK();
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("NHANVIEN{" + "LUONG=" + LUONG + ", NGAYNHANVIEC=" + NGAYNHANVIEC + '}');
        pbk.OutputPBK();
    }

    @Override
    public String toString() {
        return "NHANVIEN{" + "LUONG=" + LUONG + ", NGAYNHANVIEC=" + NGAYNHANVIEC + '}';
    }

}
