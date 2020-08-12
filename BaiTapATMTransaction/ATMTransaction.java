package BaiTapATMTransaction;

import java.util.Scanner;

public class ATMTransaction {
    protected int TransactionID;
    protected String Date;

    public int getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public ATMTransaction() {
    }

    public ATMTransaction(int TransactionID, String Date) {
        this.TransactionID = TransactionID;
        this.Date = Date;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập TransactionID: ");
        TransactionID = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập Date: ");
        Date = sc.nextLine();

    }

    public void Output() {
        System.out.println("ATMTransaction{" + "Date=" + Date + '}');
    }

    @Override
    public String toString() {
        return "ATMTransaction{" + "Date=" + Date + '}';
    }
}
