package BaiTapAbstractNguoi;

import java.util.Scanner;

public class Nguoi {

    protected String Ten;
    protected String NamSinh;

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public Nguoi() {
    }

    public Nguoi(String Ten, String NamSinh) {
        this.Ten = Ten;
        this.NamSinh = NamSinh;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Tên: ");
        Ten = sc.nextLine();
        System.out.print("Nhập Năm Sinh: ");
        NamSinh = sc.nextLine();

    }

    public void Output() {
        System.out.println("Nguoi{" + "Ten=" + Ten + ", NamSinh=" + NamSinh + '}');
    }

}
