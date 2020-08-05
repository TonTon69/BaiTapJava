package BaiTapThuaKeBaoGop;

import java.util.Scanner;

public class PHONGBANKHOA {

    private String MAPBK;
    private String TENPBK;

    public String getMAPBK() {
        return MAPBK;
    }

    public void setMAPBK(String MAPBK) {
        this.MAPBK = MAPBK;
    }

    public String getTENPBK() {
        return TENPBK;
    }

    public void setTENPBK(String TENPBK) {
        this.TENPBK = TENPBK;
    }

    public PHONGBANKHOA() {
    }

    public PHONGBANKHOA(String MAPBK, String TENPBK) {
        this.MAPBK = MAPBK;
        this.TENPBK = TENPBK;
    }

    public void InputPBK() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHẬP MÃ PBK: ");
        MAPBK = sc.nextLine();
        System.out.print("NHẬP TÊN PBK: ");
        TENPBK = sc.nextLine();
    }

    public void OutputPBK() {
        System.out.println("PHONGBANKHOA{" + "MAPBK=" + MAPBK + ", TENPBK=" + TENPBK + '}');
    }

    @Override
    public String toString() {
        return "PHONGBANKHOA{" + "MAPBK=" + MAPBK + ", TENPBK=" + TENPBK + '}';
    }
}
