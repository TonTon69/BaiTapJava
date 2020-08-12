package BaiTapATMTransaction;

import java.util.Scanner;

public class Account extends ATMTransaction {
    private String Type;
    private String BrandLocation;
    private String Pin;

    Customer OwnedBy = new Customer();

    public Account() {
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }

    public String getBrandLocation() {
        return BrandLocation;
    }

    public void setBrandLocation(String BrandLocation) {
        this.BrandLocation = BrandLocation;
    }

    public Account(String Type, String BrandLocation, String Pin) {
        this.Type = Type;
        this.BrandLocation = BrandLocation;
        this.Pin = Pin;

    }

    public Account(String Type, String BrandLocation, String Pin, int TransactionID, String Date) {
        super(TransactionID, Date);
        this.Type = Type;
        this.BrandLocation = BrandLocation;
        this.Pin = Pin;
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("Account{" + "Type=" + Type + ", BrandLocation=" + BrandLocation + ", Pin=" + Pin + '}');

        OwnedBy.Output();
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Type: ");
        Type = sc.nextLine();
        System.out.print("Nhập BrandLocation: ");
        BrandLocation = sc.nextLine();
        System.out.print("Nhập Pin: ");
        Pin = sc.nextLine();

        OwnedBy.Input();

    }

}
