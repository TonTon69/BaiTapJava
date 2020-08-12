package BaiTapATMTransaction;

import java.util.Scanner;

public class TransactionTransfer extends ATMTransaction {
    protected int Amount;
    Customer CustomerTo = new Customer();

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public TransactionTransfer() {
    }

    public TransactionTransfer(int Amount) {
        this.Amount = Amount;
    }

    public TransactionTransfer(int Amount, int TransactionID, String Date) {
        super(TransactionID, Date);
        this.Amount = Amount;
    }

    @Override
    public void Output() {
        super.Output(); // To change body of generated methods, choose Tools | Templates.
        System.out.println("TransactionTransfer{" + "Amount=" + Amount + '}');

        CustomerTo.Output();
    }

    @Override
    public String toString() {
        return "TransactionTransfer{" + "Amount=" + Amount + '}';
    }

    @Override
    public void Input() {
        super.Input(); // To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Amount: ");
        Amount = sc.nextInt();

        CustomerTo.Input();

    }

    public void Transfer() {
        System.out.println("Vua chuyen cho" + CustomerTo.getName() + "" + Amount);
    }

}
