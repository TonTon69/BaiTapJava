package BaiTapNguoi;

import java.util.Scanner;

public class Nguoi {
    protected String Ten;
    protected int NamSinh;

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public Nguoi() {
    }

    public Nguoi(String Ten, int NamSinh) {
        this.Ten = Ten;
        this.NamSinh = NamSinh;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Tên: ");
        Ten = sc.nextLine();
        System.out.print("Nhập Năm Sinh: ");
        NamSinh = sc.nextInt();
    }

    public void Output() {
        System.out.println("Nguoi{" + "Ten=" + Ten + ", NamSinh=" + NamSinh + '}');
    }

    @Override
    public String toString() {
        return "Nguoi{" + "Ten=" + Ten + ", NamSinh=" + NamSinh + '}';
    }
}
