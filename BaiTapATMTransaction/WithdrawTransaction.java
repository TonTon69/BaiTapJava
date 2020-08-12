package BaiTapATMTransaction;

import java.util.Scanner;

public class WithdrawTransaction extends ATMTransaction {
    protected int Amount;

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public WithdrawTransaction() {
    }

    public WithdrawTransaction(int Amount) {
        this.Amount = Amount;
    }

    public WithdrawTransaction(int Amount, int TransactionID, String Date) {
        super(TransactionID, Date);
        this.Amount = Amount;
    }

    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println(toString());
    }

    public String toString() {
        return "WithdrawTransaction{" + "Amount=" + Amount + '}';
    }

    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Amount: ");
        Amount = sc.nextInt();

    }

    public void WithDraw() {
        System.out.println("Vua rut" + Amount);
    }

}
