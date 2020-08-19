package BaiTapInterfaceHinh;

import java.util.Scanner;

public class HINHTRON implements IHINH {

    private float bankinh;

    public float getBankinh() {
        return bankinh;
    }

    public void setBankinh(float bankinh) {
        this.bankinh = bankinh;
    }

    public HINHTRON() {
    }

    public HINHTRON(float bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        bankinh = sc.nextFloat();
    }

    @Override
    public void Output() {
        System.out.println(
                "HINHTRON{" + "bankinh=" + bankinh + ", Diện tích=" + DienTich() + ", Chu vi=" + ChuVi() + '}');
    }

    @Override
    public float DienTich() {
        return pi * bankinh * bankinh;
    }

    @Override
    public float ChuVi() {
        return 2 * pi * bankinh;
    }

}
