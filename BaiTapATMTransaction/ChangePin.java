package BaiTapATMTransaction;

import java.util.Scanner;

public class ChangePin extends ATMTransaction {
    protected String OldPin;
    protected String newPin;

    public ChangePin() {
    }

    public String getOldPin() {
        return OldPin;
    }

    public void setOldPin(String OldPin) {
        this.OldPin = OldPin;
    }

    public String getNewPin() {
        return newPin;
    }

    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }

    public ChangePin(String OldPin, String newPin) {
        this.OldPin = OldPin;
        this.newPin = newPin;
    }

    public ChangePin(String OldPin, String newPin, int TransactionID, String Date) {
        super(TransactionID, Date);
        this.OldPin = OldPin;
        this.newPin = newPin;
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("ChangePin{" + "OldPin=" + OldPin + ", newPin=" + newPin + '}');
    }

    @Override
    public String toString() {
        return "ChangePin{" + "OldPin=" + OldPin + ", newPin=" + newPin + '}';
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập OldPin: ");
        OldPin = sc.nextLine();
        System.out.print("Nhập newPin: ");
        newPin = sc.nextLine();
    }

    public void Change(Account acc) {
        if (acc.getPin() == OldPin) {
            acc.setPin(newPin);
            System.out.println("Doi ma pin thanh cong");

        }
        if (acc.getPin() != OldPin) {
            System.out.println("Sai mat khau");
        }
    }

}
