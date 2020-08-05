package BaiTapThuaKeBaoGop;

import java.util.Scanner;

public class CONNGUOI {

    protected String HOTEN;
    protected int NAMSINH;

    public String getHOTEN() {
        return HOTEN;
    }

    public void setHOTEN(String HOTEN) {
        this.HOTEN = HOTEN;
    }

    public int getNAMSINH() {
        return NAMSINH;
    }

    public void setNAMSINH(int NAMSINH) {
        this.NAMSINH = NAMSINH;
    }

    public CONNGUOI() {
    }

    public CONNGUOI(String HOTEN, int NAMSINH) {
        this.HOTEN = HOTEN;
        this.NAMSINH = NAMSINH;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHẬP HỌ TÊN: ");
        HOTEN = sc.nextLine();
        System.out.print("NHẬP NĂM SINH: ");
        NAMSINH = sc.nextInt();
    }

    public void Output() {
        System.out.println("CONNGUOI{" + "HOTEN=" + HOTEN + ", NAMSINH=" + NAMSINH + '}');
    }

    @Override
    public String toString() {
        return "CONNGUOI{" + "HOTEN=" + HOTEN + ", NAMSINH=" + NAMSINH + '}';
    }
}
